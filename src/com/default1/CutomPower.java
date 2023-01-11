package com.default1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CutomPower {
	
	public static long power(int value, int powerValue) {
		int midValue = powerValue/2;
		
		if(powerValue==0) {
			return 1;
		}
		
		if(powerValue == midValue) {System.out.println("Exec");
			return value*power(value,2);
		}
		
		return value*power(value,(powerValue-1));// 2*power(2,5) -> 2*power(2,5)*power(2,4)..... log(n); O(n);
		
		
	}

	public static void main(String[] args) {
		
		//System.out.println(power(2, 6));
		
		//B b = (B)new A();
		
		List<Student> studList = new ArrayList<>();
		
		studList.add(new Student(1, 5));
		studList.add(new Student(2, 50));
		studList.add(new Student(3, 20));
		studList.add(new Student(4, 55));
		
		Comparator<Student> studentComp = Comparator.comparing(Student :: getMarks);
		
		System.out.println(studList.stream().max(studentComp).get().id);

	}
	
	
	

}

class A{
	int a;
}

class B extends A{
}

class Student{
	int id,marks;
	Student(int id, int marks){
		this.id = id;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}


