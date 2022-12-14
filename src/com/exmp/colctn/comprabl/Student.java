package com.exmp.colctn.comprabl;

public class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
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
	@Override
	public int compareTo(Student o) {
		if(id>o.id)
			return 1;
		else if (id<o.id)
			return -1;
		else {
			return name.compareTo(o.name);
		}
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
