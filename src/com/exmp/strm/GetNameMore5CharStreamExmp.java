package com.exmp.strm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetNameMore5CharStreamExmp {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abdulla","Vipin","Rohit","Shivam");
		 
		//aprch 1
		list.stream().filter(s -> s.length()>5).forEach(s -> System.out.println(s));
		
		//aprch 2
		List<String> lt = list.stream().filter(s -> s.length()>5).collect(Collectors.toList());
		System.out.println(lt);

	}

}
