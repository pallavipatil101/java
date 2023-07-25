package pallavi.training;

public class HDFCchild extends HDFC{
	
	@Override
	public void withdraw() {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Bank.ACCOUNTTYPE);
		
		HDFCchild h = new HDFCchild();
		
		h.openAcc();
		h.withdraw();
		h.deposit();
		
	}
}
