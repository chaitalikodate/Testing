package Basic;



class Girl extends Thread {
	int C=1 ;
	public void run() {
		
	while(C<10) {
		System.out.println("Girl"+C);
		C++;
	}
	}
}

class Boy extends Thread{
    int count=0 ;
   public void run(){ 		
	while(true) {
		System.out.println("Boy"+count);
		count++;
	}
   }
	
}
public class ThreadOne {
	public static void main(String[] args)throws Exception {
		
		Girl g=new Girl();
		g.setDaemon(true);
		Boy  b=new Boy();
		
		System.err.println(g.getId());
		g.start();
		System.out.println(g.isDaemon());
		System.out.println(g.isAlive());
	}

}
