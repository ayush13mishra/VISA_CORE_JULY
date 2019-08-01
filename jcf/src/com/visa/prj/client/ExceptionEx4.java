package com.visa.prj.client;

public class ExceptionEx4 {
	 
	public static void main(String[] args) {
		Thread.currentThread().setUncaughtExceptionHandler((ex,m) -> System.out.println("Boom :-("));
		System.out.println("Hello!!!");
		doTask();
	}

	private static void doTask() {
		System.out.println("Compute a Task!!");
		int x = 10;
		int y = 0;
		System.out.println(x/y);
	}

}
