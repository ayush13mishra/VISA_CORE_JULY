package com.visa.prj.client;

public class ExceptionEx5 {

	public static void main(String[] args) {
		Thread.currentThread().setUncaughtExceptionHandler((ex, m) -> System.out.println("Boom :-("));
		System.out.println("Hello!: " + doTask());

	}

	private static int doTask() {
		try {
		int x = 10;
		int y = 2;
		return x /y;
		} catch(ArithmeticException ex) {
			return 100;
		} finally {
			return 900;
		}
	}

}
