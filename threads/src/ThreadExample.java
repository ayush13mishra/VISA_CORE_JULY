class Chars implements Runnable {
	@Override
	public void run() {
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char)i);
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main Starts!!!");
			NumberThread t1 = new NumberThread(1, 40);
			NumberThread t2 = new NumberThread(800, 1400);
			t2.setDaemon(true);
			t1.start();
			t2.start();
			Chars ch = new Chars();
//			ch.run();
			
			Thread t3 = new Thread(ch);
			t3.setDaemon(true);
			t3.start();
			doTask();
		System.out.println("Main Dies!!!");
	}

	private static void doTask() {
		Thread t = Thread.currentThread();
		System.out.println("Name: " + t.getName());
		System.out.println("Group: " + t.getThreadGroup().getName() );
		System.out.println("Priority : " + t.getPriority());
		/*
		 * JRE checks the status of only Non-Daemon threads before it terminates
		 */
		System.out.println("Daemon : " + t.isDaemon());
	}

}
