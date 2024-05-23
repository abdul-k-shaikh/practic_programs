package com.test.june.genericsEx;

public class Employee {
    private String name;
    private double salary;
    private int id;

    // Constructor, getters, and setters

    /**
	 * @param name
	 * @param salary
	 * @param id
	 */
	public Employee(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
    @Override
    public int hashCode() {
        return id;
    }
}

