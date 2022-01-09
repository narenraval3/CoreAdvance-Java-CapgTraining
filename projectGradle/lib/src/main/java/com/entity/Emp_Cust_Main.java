package com.entity;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Emp_Cust_Main {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCustName("Naren");
		c1.setCustSecretCode("qwerty");
		
		Customer c2 = new Customer();
		c2.setCustName("Harry");
		c1.setCustSecretCode("qwerty");
		
		Customer c3 = new Customer();
		c3.setCustName("Vivak");
		c3.setCustSecretCode("aashami");
		
		Employee e1 = new Employee();
		e1.setEmpName("FinnBalor");
		
		Employee e2 = new Employee();
		e2.setEmpName("Romen");
		
		Employee e3 = new Employee();
		e3.setEmpName("Navin");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectGradle");
		EntityManager em = emf.createEntityManager();
		
		//To persist the record or insert
/*		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.getTransaction().commit(); */
		
		//To Retrieve the record
		em.getTransaction().begin();
		Customer c4 = em.find(Customer.class, 25);
		Employee e4 = em.find(Employee.class, 28);
		System.out.println("Customer c4: " +c4);
		System.out.println("Employee e4: " +e4);
		em.getTransaction().commit();
		System.out.println();
		
		//To Retrieve all the Customer
		em.getTransaction().begin();
		TypedQuery<Customer> tyq = em.createQuery("select c from Customer c", Customer.class);
		List<Customer> lCustomer = tyq.getResultList();
		System.out.println("All Customer Are: " +lCustomer);
		em.getTransaction().commit();
		System.out.println();
		
		//To Retrieve all the Employee
		em.getTransaction().begin();
		TypedQuery<Employee> etyq = em.createQuery("select e from Employee e", Employee.class);
		List<Employee> lEmployee = etyq.getResultList();
		System.out.println("All Employee Are: " +lEmployee);
		em.getTransaction().commit();
		System.out.println();
		
/*		//To Update the Customer record
		Customer c5 = new Customer();
		c5.setCustId(26);
		c5.setCustName("Omega");
		c5.setCustSecretCode("The Club");
		
		em.getTransaction().begin();
		em.merge(c5);
		em.getTransaction().commit();
		
		//To Update the Employee record
		Employee e5 = new Employee();
		e5.setEmpId(30);
		e5.setEmpName("Dean Ambrose");
		
		em.getTransaction().begin();
		em.merge(e5);
		em.getTransaction().commit(); */
		
		//To delete the record
/*		em.getTransaction().begin();
		Customer c5 = em.find(Customer.class, 26);
		em.remove(c5);
		em.getTransaction().commit(); */
		
		//To Retrieve the record by name
		em.getTransaction().begin();
		TypedQuery<Customer> cty = em.createQuery("select cus from Customer cus where cus.custName=:name", Customer.class);
		cty.setParameter("name", "Naren");
		List<Customer> lCust = cty.getResultList();
		System.out.println("Customer Retrieve By Name: " +lCust);
		em.getTransaction().commit();
		System.out.println();

		em.getTransaction().begin();
		TypedQuery<Employee> ety = em.createQuery("select em from Employee em where em.empName=:name", Employee.class);
		ety.setParameter("name", "Dean Ambrose");
		List<Employee> lEmp = ety.getResultList();
		System.out.println("Employee Retrieve By Name: " +lEmp);
		em.getTransaction().commit();
		System.out.println();
		
		//To Retrieve the Customer by named query
		em.getTransaction().begin();
		javax.persistence.Query qry = em.createNamedQuery("getAllCustomer");
		List<Customer> nCList = qry.getResultList();
		System.out.println("getAllCustomer: " +nCList);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		javax.persistence.Query sqry = em.createNamedQuery("getCustomerByName");
		sqry.setParameter("name", "Vivak");
		Customer cnameList = (Customer) sqry.getSingleResult();
		System.out.println("getCustomerByName: " +cnameList);
		em.getTransaction().commit();
		System.err.println();
		
		//To Retrieve all the name Using Native query
		em.getTransaction().begin();
		javax.persistence.Query nqry = em.createNativeQuery("select * from employee_details");
		List<Employee> nsList = nqry.getResultList();
		System.out.println(".........Native Query.............."+nsList);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		javax.persistence.Query nq = em.createNativeQuery("select * from employee_details", Employee.class);
		List<Employee> nList = nq.getResultList();
		System.out.println(".........Native Query.............."+nList);
		em.getTransaction().commit();
		System.out.println();
		
		//Dynamic Query
		String sQry = "select c from Customer c where c.custName=:name";
		em.getTransaction().begin();
		TypedQuery<Customer> dQry = em.createQuery(sQry, Customer.class);
		dQry.setParameter("name", c1.getCustName());
		Customer dCusList = dQry.getSingleResult();
		System.out.println("Customer Dynamic Query: " +dCusList);
		em.getTransaction().commit();
		
		String strQy = "select e from Employee e where e.empName=:nme";
		em.getTransaction().begin();
		TypedQuery<Employee> dEQry = em.createQuery(strQy, Employee.class);
		dEQry.setParameter("nme", e1.getEmpName());
		Employee dEmp = dEQry.getSingleResult();
		System.out.println("Employee Dynamic Query: " +dEmp);
		em.getTransaction().commit();		
	}
}
