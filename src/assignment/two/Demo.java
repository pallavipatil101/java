package assignment.two;

class Sender{	
	public void send(String msg) {
		System.out.println(msg);
	}
}

class threadedSend extends Thread{
	String msg;
	Sender s;
	public threadedSend(String msg, Sender s) {
		this.s = s;
		this.msg = msg;
	}
	public void run() {
			System.out.println(msg);
		}
}

public class Demo {

	public static void main(String[] args) {
		Sender s = new Sender();
		threadedSend t1 = new threadedSend("Hi",s);
		threadedSend t2 = new threadedSend("Bye",s);
		
		t1.start();
		t2.start();

	}

}
