package com.visa.prj.client;

public class ExceptionEx2 {
	 
	public static void main(String[] args) {
		System.out.println("Hello!!!");
		doTask();
	}

	private static void doTask() {
		System.out.println("Compute a Task!!");
		doTask();
	}

}
