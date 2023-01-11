package com.exmp.colctn.compratr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CheckStudentCompartr {

	public static void main(String[] args) {

		Student s1 = new Student(101, "Astud1");
		Student s2 = new Student(104, "Astud4");
		Student s3 = new Student(101, "Aatud3");
		Student s4 = new Student(102, "Astud2");
		
		List<Student> stList = new ArrayList<>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		stList.add(s4);
		
		Collections.sort(stList, new StudentCompartor());
		
		
		System.out.println(stList);
	}

}
