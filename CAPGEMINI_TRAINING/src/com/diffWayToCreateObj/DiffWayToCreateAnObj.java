package com.diffWayToCreateObj;
import com.diffWayToCreateObj.ForObjClass;

public class DiffWayToCreateAnObj {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

////////Using New Keyword
		ForObjClass oc = new ForObjClass();
		oc.setName("Abbot");
		oc.setId(101);
		System.out.println("NAME: " +oc.getName()+ " ID: " +oc.getId());
		System.out.println();

////////Assigning one obj to another
		ForObjClass oc1 = oc;
		System.out.println(oc1==oc);
		System.out.println("NAME: " +oc.getName()+ " ID: " +oc.getId());
		System.out.println();
		
////////Using API		
		ForObjClass oc2 = (ForObjClass)Class.forName("com.diffWayToCreateObj.ForObjClass").newInstance();		
		oc2.setName("Babbot");
		oc2.setId(201);
		System.out.println("NAME: " +oc2.getName()+ " ID: " +oc2.getId());
		System.out.println();
		
		ForObjClass oc3 = (ForObjClass)Class.forName("com.diffWayToCreateObj.ForObjClass").newInstance();		
		oc3.setName("Cabbot");
		oc3.setId(201);
		System.out.println("NAME: " +oc3.getName()+ " ID: " +oc3.getId());
		
		System.out.println();
		System.out.println(oc2==oc3);
		System.out.println(oc2.equals(oc3));
		System.out.println();
		
////////Using Cloning
		ForObjClass oc4 = new ForObjClass();
		oc4.setName("Dabbot");
		oc4.setId(401);
		System.out.println("NAME: " +oc4.getName()+ " ID: " +oc4.getId());
		System.out.println();
		
		ForObjClass oc5 = (ForObjClass)oc4.clone();
		System.out.println("NAME: " +oc5.getName()+ " ID: " +oc5.getId());				
	}
}
