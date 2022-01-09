package com.entity;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setsName("Naren");
		s1.setsAddress("Delhi");
		
		Student s2 = new Student();
		s2.setsName("Vivak");
		s2.setsAddress("Aasham");
		
		Student s3 = new Student();
		s3.setsName("Gourav");
		s3.setsAddress("Faribaad");
		
		Student s4 = new Student();
		s4.setsName("Hanok");
		s4.setsAddress("Bangalore");
		
		EntityManagerFactory eFactory = Persistence.createEntityManagerFactory("projectGradle");
		EntityManager emg = eFactory.createEntityManager();
		
/*		emg.getTransaction().begin();
		emg.persist(s1);
		emg.persist(s2);
		emg.persist(s3);
		emg.persist(s4);
		emg.getTransaction().commit();*/
		
		//To Retrieve the data from database
		emg.getTransaction().begin();
		Student stud = emg.find(Student.class, 19);
		System.out.println("***-----STUD-----***"+stud);
		emg.getTransaction().commit();
		System.out.println();
		
		//To Retrieve all the Students
		emg.getTransaction().begin();
		TypedQuery<Student> sQuery = emg.createQuery("select s from Student s", Student.class);
		List<Student> ls = sQuery.getResultList();
		System.out.println("***************STUDENTS***************"+ls+"***************TOTAL STUDENT SIZE************ "+ls.size());
		emg.getTransaction().commit();
		System.out.println();
				
		//To Update the Record
/*		Student s5 = new Student();
		s5.setsId(18);
		s5.setsName("Pooja");
		s5.setsAddress("KTM");
		
		emg.getTransaction().begin();
		emg.merge(s5);
		emg.getTransaction().commit();*/
		
		//To delete the data
/*		emg.getTransaction().begin();
		Student std = emg.find(Student.class, 18);
		emg.remove(std);
		emg.getTransaction().commit();*/
		
		//To retrieve the data by name 
		emg.getTransaction().begin();
		TypedQuery<Student> studQuery = emg.createQuery("select student from Student student where student.sName=:name And student.sAddress=:addres",Student.class);
		studQuery.setParameter("name", "Naren");
		studQuery.setParameter("addres", "Delhi");
		List<Student> studentList = studQuery.getResultList();
		System.out.println("**-----***---Student Name---**---"+studentList+"**---------**--Total Student Size--**---------** "+studentList.size());
		emg.getTransaction().commit();
		System.out.println();
		
		//To Retrieve by named query
		emg.getTransaction().begin();
		javax.persistence.Query qy = emg.createNamedQuery("getAllStudents");
		List<Student> sList = qy.getResultList();
		System.out.println("*----------getAllStudents-----------------*"+sList);
		
		javax.persistence.Query qryByName = emg.createNamedQuery("getStudentByName");
		qryByName.setParameter("name", "Naren");
		Student stdList = (Student) qryByName.getSingleResult();
		System.out.println("*----------getStudentByName-----------------*"+stdList);
		emg.getTransaction().commit();
		System.out.println();
		
		//To Retrieve all the name Using Native query
		emg.getTransaction().begin();
		javax.persistence.Query nqry = emg.createNativeQuery("select * from Student");
		List<Student> nsList = nqry.getResultList();
		System.out.println(".........Native Query.............."+nsList);
		emg.getTransaction().commit();
		
		emg.getTransaction().begin();
		javax.persistence.Query nquery = emg.createNativeQuery("select * from Student",Student.class);
		List<Student> nqList = nquery.getResultList();
		System.out.println("...........Native Query in Student class..........."+nqList);
		emg.getTransaction().commit();
		System.out.println();
		
		//Dynamic Queries with Parameters
		String sqlString = "select s from Student s where s.sName=:name";
		emg.getTransaction().begin();
		TypedQuery<Student> qey = emg.createQuery(sqlString, Student.class);
		qey.setParameter("name", s1.getsName());
		Student strStudent = qey.getSingleResult();
		System.out.println("-------Dynamin Query-----------------" +strStudent);
		emg.getTransaction().commit();
		
		String sqString = "select s from Student s where s.sName=:nme";
		emg.getTransaction().begin();
		TypedQuery<Student> sqey = emg.createQuery(sqString, Student.class);
		sqey.setParameter("nme", s2.getsName());
		Student sStud = sqey.getSingleResult();
		System.out.println("-------Dynamin Query-----------------" +sStud);
		emg.getTransaction().commit();
	}
}
