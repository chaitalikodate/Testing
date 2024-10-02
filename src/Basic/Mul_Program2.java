package Basic;

class ProgramTwo extends Thread{
	
	public void run() {
		int count=1;
		while(true) {
			System.out.println("othre"+count++);
			
		}
		
		}
	}



public class Mul_Program2 {
public static void main(String[] args) throws Exception {
	
ProgramTwo p=new ProgramTwo();
Thread.sleep(100);
p.setDaemon(true);

p.start();



}


}



