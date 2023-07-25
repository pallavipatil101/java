package pallavi.training;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new Runnable()
				{
					public void run() {
						for(int i=1; i<=5; i++) 
					   {
						System.out.println("Hi");
						try {Thread.sleep(500);} catch (InterruptedException e) {}
					}
				}
				};
		Runnable r2 = new Runnable()
				{
					@Override
					public void run() {
						for(int i=1; i<=5; i++) 
					{
						System.out.println("Hello");
						try {Thread.sleep(500);} catch(Exception e) {}
					}
				}
				};
				
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		Thread.sleep(500);
		t2.start();
		
		
	}
}
