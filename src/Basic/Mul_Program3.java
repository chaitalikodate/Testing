package Basic;


class MulThree extends Thread{
	public void run() {
		int count=1;
		while(true) {
			System.out.println(count++);
		}
	}
	
}

public class Mul_Program3 {
	public static void main(String[] args)throws Exception {
		MulThree mt=new MulThree();
	
		mt.setDaemon(true);
		mt.start();
	 Thread mainThread= Thread.currentThread();
	 mainThread.join();
	}

}
