package com.functionalPractc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareNameAndId {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Abc1", 5000));
		empList.add(new Employee(4, "Abc1", 3000));
		empList.add(new Employee(1, "Abc2", 5000));
		empList.add(new Employee(3, "Abc1", 7000));
		
		empList.stream().sorted(Comparator.comparing((Employee emp) -> emp.getId()).thenComparing(e -> e.getName()));
		
		System.out.println(empList);

	}

}

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
}
