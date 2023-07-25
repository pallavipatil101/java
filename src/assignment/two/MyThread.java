package assignment.two;

public class MyThread {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable()
		{
			public void run() {
				for(int i=1; i<=10; i++) 
			   {
				System.out.println(i);
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		}
		};
		Runnable obj2 = new Runnable()
		{
			public void run() {
				for(int i=1; i<=10; i++) 
			{
				System.out.println(i);
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		}
		};
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
