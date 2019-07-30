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

		Access Code: visat45
	Recap
	-----
		OOP
			instance variables ==> Heap Area
			static variables ==> class variables ===> Class Data ==> PermGen==>MetaSpace

			local variables ==> Stack
		instance variables ==> GC

		Logically grouping of objects
		Generalization and Specialization ==> extends ==> Inheritance
		super(); constructor chaining to super class constructor
		abstract class:
			can't instantiate
		abstract method: pure virtual function without body
			All inherited class should compulstorly override this method
			else the inherited class should be marked abstract
		==============

		public static Time addTime(Time t1, Time 2) {

		}

		public Time addTime(Time t) {
			this and t will be used
		}
		==================================

		Realization Relationship
		========================
			A Component/Object will realize the behaviour specifed by Other component/object in order to communicate

			Project and Laptop can communicate with each other because
			Project has specifed that the communication can happen using HDMI/ VGA
			Laptop realizes it
			This is done using interface

		In Software Industry

		UI ==> Service ==> DAO Implementation ==> database

		As of Java 7:
		interface interfaceName{
			abstract methods
			constants
		}

		Why program to interface?
			a) DESIGN
			b) IMPLEMENTATION
			c) TESTING
			d) INTEGRATION

			interface UserDao {
				void register(User user);
				boolean login(User user);
			}


		interface Flyable {
			void fly();
		}	


		class Bird implements Flyable {
			fly()
		}

		class Aeroplane implements Flyable {
			fly()
		}
	============

	Creating Objects:
		a) If we know the class Name

			obj = new ClassName();

		b) We Don't know the class name, still need to create an object

		String s = "java.util.Date";

 		Class.forName(s); //loads the Date class

 			Class.forName(s).newInstance();

 	==========================

 	Generic Class and interface

 		class Rectangle<T> {   				class Rectangle {
 			T width;								Object width;
 			T breadth; 								Object breadth;
 			//
 		}

 		Rectangle<Integer> r1 = new Rectangle<>(4,5);
 		Rectangle<Dobule> r2 = new Rectangle<>(1.4,3.5);


 		class Node<T> {
 			T data;
 			Node<T> next;
 				//
 		}

 		class LinkedList<T> {
 			Node<T> first; 
 			//
 		}

 		LinkedList<Employee> empList;
 ====================================================
 											Fight f  = new Fight(); // ERROR
interface Dance {							Fight f = new Hero();
	dance();								f.fight();
}											f.dance(); /ERROR
											Dance d = (Dance) f;
interface Swim {							d.dance();
	swim();
}

interface Fight {
	fight();
}

class Actor implements Dance {
		dance(){}
}

class Hero extends Actor implements Fight, Swim {
	fight() {} swim() {}
}

==============
	


	Functional Interface: is an interface where in only one method
	needs to be implemented


	interface Flyable {
		void fly();
	}

	class Bird implements Flyable {
		public void fly() {

		}
	}

	Flyable f = new Flyable(); // ERROR

	Flyable f = new Bird();


	Flyable f = new Flyable() {
		public void fly() {
			"jump from 10th floor!!!";
		}
	}

	f.fly();
=================================================
	Java Collection Framework
		Data Containers
		Array is a data container, should be the first choice 
		==> Size is fixed, adding/removing at arbitrary position is difficult
		==> Contiguos memory

	JCF provides data containers which are inter-operable.
		a) interfaces
		b) implementations
			==> Apache
			==> VAVR
		c) Utility classes


		class Folder implements Comparable<Folder> {

			int compareTo(Folder other){
				name comparision
			}
		}

	List 										Set
a) supports duplicates 						unique
b) ordered 									Not
c) supports index based operation 			Not
		get(20);
		add("a", 5)
		remove(5);

d) re-ordered [ sort, shuffle, reverse]		Not

	
	BAD:

		List list = new ArrayList();
		list.add("A");
		list.add(new Date());
		list.add(new Product());


		List<String> list = new ArrayList<>();
		list.add("A");
		list.add(new Date()); // Compilation Error
==================================================

	Functional Style of Programming

	OOP 							functional style
methods 							function
tightly coupled to state 			functions are independent of state of		
of object
deposit(), getBalance()
=============
	
	High Order Functions
		=> Functions which accept other functions as arguments
		==> function which return a function

	commonly used high order functions:
		a) map
			transform data
		b) filter
			filtering
		c) reduce
			aggregate
		d) forEach
			traverse
		e) sort


		terminal operations:
			forEach()
			reduce()
			collect()
			sum()

		intermediary operations:
			map()
			filter()
			limit()
			skip()
			flatMap()
			







