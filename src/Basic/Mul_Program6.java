package Basic;


class AtmMachine{
	
 synchronized public void customerName(String name) {
		System.out.println(name+" using ATM Currently");
		try {
		Thread.sleep(1000);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
 }
	
	 synchronized public void showBalance(String name, int balance) {
		System.out.println(name+" withdrawn "+balance);
		
	}
	
}

class Customer extends Thread {
	String name;
	int Amount;
	 AtmMachine am;
	 public Customer(AtmMachine atm, String name, int Amount) {
		 this.am= atm;
		 this.name=name;
		 this.Amount=Amount;
	 }
	 
	 public void UseAtm() {
		 am.customerName(name);
		 am.showBalance(name,Amount);
	 }
	 public void run() {
		 UseAtm();
	 }
	 
	 
}





public class Mul_Program6 {
	
	public static void main(String[] args) {
		AtmMachine atmMachine=new AtmMachine();
		Customer c=new Customer(atmMachine,"chaitali",200);
		Customer c2=new Customer(atmMachine,"Shivali",500);
		
		
		c.start();
		c2.start();
		
	}

}
