package com.spring.form.employee.controller;

public class EmployeeBean {
	private int id;
	private String employeename;
	private double employeesalary;
	private String employeedesignation;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(int id, String employeeName, double employeeSalary, String employeeDesignation) {
		super();
		this.id = id;
		employeename = employeeName;
		employeesalary = employeeSalary;
		employeedesignation = employeeDesignation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeename;
	}
	public void setEmployeeName(String employeeName) {
		employeename = employeeName;
	}
	public double getEmployeeSalary() {
		return employeesalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		employeesalary = employeeSalary;
	}
	public String getEmployeeDesignation() {
		return employeedesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		employeedesignation = employeeDesignation;
	}
	

}
