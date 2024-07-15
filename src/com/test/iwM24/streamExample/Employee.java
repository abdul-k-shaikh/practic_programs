package com.test.iwM24.streamExample;

public class Employee {
	private int empId;
    private String empName;
    private long empSalary;
    private String deptId;
    
	
	/**
	 * @param empId
	 * @param empName
	 * @param empSalary
	 */
	public Employee(int empId, String empName, long empSalary, String deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptId = deptId ;
	}
//	public Employee(int empId2, String empName2, int empSalary2) {
//		// TODO Auto-generated constructor stub
//	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", deptId=" + deptId
				+ "]";
	}
	
    
}
