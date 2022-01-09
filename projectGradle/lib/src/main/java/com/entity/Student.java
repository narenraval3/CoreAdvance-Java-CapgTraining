package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(
		{
			@NamedQuery(name="getAllStudents", query="select student from Student student"),
			@NamedQuery(name="getStudentByName", query="select student from Student student where student.sName=:name")
		})
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sId;
	private String sName;
	private String sAddress;
	
	public Student()
	{
		//
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}

}
