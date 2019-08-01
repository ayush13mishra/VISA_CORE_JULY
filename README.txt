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

		https://rxmarbles.com/
	================================================
	

	products.stream()
	products.parallelStream()

	===============================================

	HashSet uses hashCode() and equals() to identify duplicates

		HashCode [ Numerical representation ]:
			==> Two similar objects should have same hashcode	
			==> Two objects with different content can also have same hashcode

	Map is a key/value pair
		==> Dictionary
		==> Registry

	Map<Key,Value> map

	Map<String, Double>

	Map<String, List<Employee>> 

============================================================================
	Every exception is an object
		==> What went wrong
		==> Where?
		==> Why?
	Error and Exception types of exceptions

	Error types of exceptions can't be handled during runtime
		UnsatisfiedLinkError
		StackOverflowError
	Exception types of excetions can be handled


	Exception types of Exceptions can be classified into:
	a) Checked 
	b) Unchecked

	Unchecked
		Compiler doesn't enforce handling with try-catch
		should be handled using conditional statements

		Employee e = null;

		if(e != null) {
			String s = e.getName();
		}

		Exceptions reasons are within JRE

	Checked
		Compiler enforecs you to handle using try-catch
		No way you can handle it with conditional statement
		Reasons are outside JRE
			SQLException
			ClassNotFoundException
			IOExcpetion
			SocketException


		try {

		} catch(Exception ex) {

		} finally {

		}
		============================
		Compilation Errors: Code Not Reachable [ DEAD code]
		try {

		} catch(IOException ex) {

		} catch(FileNotFoundException ex) {

		}
		=======================

		Java Concurrent Programming ==> MultiThreaded applications

		A process ==> Program in execution
			A process needs at least one unit of work running
			Thread is a unit of work within a process
			Every Thread has a seperate Stack

		Notepad, Calculator ==> Single Threaded application

		Eclipse, Word, Browsers ==> Multi threaded applications
		Word
			Edit, SpellCheck, Grammer Check, AutoSaving

		Why Multithreaded application?
			a) User Experience
			b) Avoid starvation
			c) Optimization of available resources including CPUs
		==============
		Main Thread: entry point is main()
		for every other user threads entry point is : run()

		interface Runnable {
			void run();
		}	

		Thread class: thread control methods
			a) start()
			b) yield()
			c) interrupt()
			d) join()
			e) sleep(long ms)

			deprecated:
			f) stop()
			g) suspend()
			i) resume()

			http://collabedit.com/k4k72
==============================================

	Thread Safety
		A member is said to be thread safe if it doesn't get corrupted in
			mult-threaded environment
		local var --> Stack --> Each thread has a seperate stack --> Safe

		instance var --> Heap --> shared by threads -> Not Safe
		static var --> class data -> shared --> not Safe

		Atomic variables with volatile keyword --> Safe

		class SomeClass {
			private volatile boolean flag = true;

		}

====================
		Unit Testing
		Developer has to do the UnitTesting

		For every class we write a test class

		Account 					AccountTest

		TCER ==> Test Case Expected Result
		
		NO | Description | class | Method | Sample Data|expected Output| Actual |RESULT


		UnitTesting Frameworks for Java:
			JUnit
			TestNG
=================================

	Java Concurrency New APIs

		Problems with legacy concurrency solutions:
		a) synchronized		
			i) One lock per object [ instance var]
			ii) one per class	[ static var ]

			Account 
					balance
					profileInfo

			iii) only owner can release the mutex/monitor/lock
					Release when we come out of critical section or call wait()
					JMX
			iv) Lots of DeadLock
			class BankingService {
				public void transferFunds(Account fromAcc, Account toAcc, double amt) {
					synchronized(fromAcc) {
						synchronized(toAcc) {
								update formAcc
								update toAcc
								insert into tx table
						}
					}
				}
			}

			v) No Timeout

			T1
				SB105, SB106   60000
			T2
				SB106, SB105	89999

	Rentrant locks

		synchronized void doThat() {
			code
				doThis();
			code
		}		

		synchronized void doThis() {

		}			


		@Roles("admin")
		public void release() {
			balLock.unlock();
		}


		With Lock APIs

			class BankingService {
				public void transferFunds(Account fromAcc, Account toAcc, double amt) {
					if(fromAcc.balLock.tryLock(1000)) {
						try{
							if(toAcc.balLock.tryLock(1000)) {
								try{
										update formAcc
										update toAcc
										insert into tx table
									} finally {
										toAcc.balLock.unlock();
									}
							}
						   } finally {
						   		fromAcc.balLock.unlock();
						   }
					}
				}
			}

			T1
				SB105, SB106   60000
			T2
				SB106, SB105	89999
=================================================================











