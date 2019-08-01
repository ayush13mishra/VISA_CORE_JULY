package com.visa.prj.client;

import com.visa.prj.entity.Employee;

public class EmpTest {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = new String ("Aa");
		String s4 = new String ("BB");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		Employee e1 = new Employee(1,"A");
		Employee e2 = new Employee(1,"A");
		
		Employee e3 = e1;
		
		if(e1 == e3) {
			System.out.println("Same [e1 and e3] ");
		}
		if(e1 == e2) {
			System.out.println("Same [e1 and e2] ");
		}
		if(e1.equals(e2)) { 
			System.out.println("Same [e1 and e2] ");
		}
	}

}


