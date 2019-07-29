Java
Banuprakash C
banu@lucidatechnologies.com
banuprakashc@yahoo.co.in
-----------------------------
 
Week 1:
	Java as a Programming Language
Week 2:
	Web Development using Servlet and JSP
	JPA
	Spring Core Container
Week 3:
	Spring MVC
	Spring RESTful Webservices
	Spring Security
-----------------------------------------
	
	OOP
		Object Oriented Programming
		Programming which resemble real world

		Object communicates with other by sending a message. What messages object can
		accept is exposed thro its interface.

		OBject just needs to know what the message does rather than how it is going to work
	----

		OOP should follow SOLID Design Principles

		S ==> Single Responsibility
		O ==> Open Close Principle (OCP) 
				Open for Extension
				Closed for Change
		L ==> Liskov Substitution Principle
		I ==> Interface seggregation
		D ==> Dependecy Injection

	------
		What is Java?
			Java is a technology
				==> Platform + APIs
					to execute a certain kind of code called as ByteCode

			How do you generate a bytecode?
				Choose a programming language and compile

				Java Prog Lang ---> Java Compiler ---> ByteCode
				Kotlin Prog ---> Kotlin Compiler ---> Bytecode
				Groovy Prog ---> Groovy Compiler ----> Bytecode

			ByteCode is portable [ Platform Independent and Architecture Neutral]


	=============================================
	
	Object --> state and behaviour

	Templates for Objects
		class , Type, function, ..

		class Account {

		}	

		Account sa  = new Account();


		function Account () {

		}

		var sa = new Account();

	==========

	Logically grouping of Objects/classes

		a) Entity / Domain / Model
			==> Business data
			Customer, Trip, Payment, Driver, Vehicle
		b) DAO ==> Data Access Object
		c) Business 
		d) Service ( Facade)
			void transferFunds(Account fromAcc, Account toAcc, double amt) {

			}

		e) UI
		f) Utility

	============

	https://xxxxx-6080.cloudlab.jnaapti.io/vnc.html

	Eclipse IDE

	Comments:
		for Developers
		a) 
		/*

		*/

		b) // single line comment

		for API users
		Java Doc Comments
		/**

		*/
		=======

		ClassLoader:
			findLoadedClass()
			loadClass()
			findSystemClass()
			defineClass()


	String s1 = new String("Hello"); // goes to EDEN area

	String s2 = "World"; // String POOL area

	String s3 = "World"; // refers to existing

	s2 == s3 ; // true

	String s4 = new String("Hello"); // goes to EDEN area

	s1 == s4; // false

	System.gc();

	===================================================


	Relationship between Objects:
	a) Generalization and Specialization
	b) Realization
	c) Assoication
	d) Uses A

	Tools of Development for Java

	a) Checkstyle
		checks for NamingConventions, whitespaces, comments
	b) PMD and FindBugs
		Coding Conventions
			==> Empty Conditional Statement
			if(cond){

			} else {
				code
			}
			===> Dead Code
			===> Empty Catch Block
			===> Copy & Paste Code
	c) SONAR
	d) Clover/ CodeCoverage
	e) GITHub
	f) Maven
	g) Jenkins

	https://shrib.com/#banu

	Issues with VM like [ Ctrl, Caps lock]

	VM terminal
	without 6080
	https://abc.cloudlab.jnaapti.io

	terminal
	login
	# sudo systemctl restart jnaaptivnc

	============

	class Product {
		Product() {										new Mobile(); // PA , MA
			prints PA
		}												new Mobile(22,"iPhone");
		Product(int x) {								// PA, MX
			prints PX
		}
	}


	class Mobile extends Product {
		Mobile() {
			//super();
			prints MA
		}

		Mobile(int x, String a){
			prints MX
		} 
	}
	=======

	class Mobile extends Product {
		Mobile() {
			//super();
			prints MA
		}
	==========

	class Product {
		 										new Mobile(22,"iPhone");
		Product(int x) {								//  
			prints PX
		}
	}


	class Mobile extends Product {
		Mobile() {
			//super();
			prints MA
		}

		Mobile(int x, String a){
			prints MX
		} 
	}
 	====================

 	class Product {
 		doTask() { prints "PTASK"}

 	}

 	class Mobile extends Product {
 		doTask() { prints "MTASK"}
 		print() { prints "MPRINT" }
 	}
 	
 	Product p = new Mobile(); // valid ==> UPCASTING
 	p.doTask(); // MTASK
 	p.print(); // Cmpiler Error

 		Product[] products = new Product[5]; // Array of 4 Pointers
		products[0] = new Tv(133,"Sony Bravia",135000.00,"LED");
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634,"Onida Thunder",3500.00,"CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(844, "Oppo", 9999.00, "4G");

	-------
	Java doesn't support multiple inheritance
	Object is the super class for all objects [ Single root hierarchy]

	constructor chaining super()
	constrcutor chain with a class this()
	class A {
		A() {

		}
		A(int x) {
			this();
		}
	}

	============

	class Product {
		doTask() {

		}
	}

	class Mobile extends Product {
		doTask() {
			super.doTask();
		}
	}

	Product p = mew Mobile();
	p.doTask();

	===================

	