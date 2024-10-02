package Basic;


class ProgramFour extends Thread{
	  public void run() {
		  int count=1;
		  while(true) {
			  System.out.println("other"+count++);
		  }
	  }
}


public class Mul_Program4 {
	public static void main(String[] args)throws Exception {
		ProgramFour p=new ProgramFour();
	     p.setDaemon(true);
		p.start();
		Thread t= Thread.currentThread();
		t.join();
	
		}
		
	

}

