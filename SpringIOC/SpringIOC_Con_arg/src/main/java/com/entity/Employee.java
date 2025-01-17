package com.entity;

public class Employee {

	private int empId;
	private String name;
	private String address;

	private Department dept;

	public Employee() {
		super();
	}

	public Employee(int empId, String name, String address, Department dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", dept=" + dept + "]";
	}
}
