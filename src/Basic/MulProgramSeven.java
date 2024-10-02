package Basic;

class MyData{
	int value;
	boolean flag=true;
	
	 public void setData(int v)  {
		while(flag!=true) {
			try {
			wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		this.value=v;
		flag=false;
		notify();
	}
	
	 public int getData() {
		
		int x=0;
		while(flag != false) {
			try {
				wait();
			}
			catch(Exception e ) {
				System.out.println(e);;
			}
		}
		flag=true;
		notify();
		x=value;
		return x;
		
	}
}
	
	

class Producer extends Thread{
	int value=1;
	MyData md;
	public Producer(MyData md) {
		this.md=md;
	}
	
	public void run() {
	while(true) {
		md.setData(value);
		System.out.println("prodeucer "+value);
		value++;
	}
	}
	
}
class Consumer extends Thread{
	MyData md;
	
	public Consumer(MyData md) {
		this.md=md;
	}
	
	public void run() {
	int x=0;
	while(true) {
		x=md.getData();
		System.out.println("consumer"+x);
	}
	}
	
}

public class MulProgramSeven {
  public static void main(String[] args) {
	MyData md=new MyData();
	Producer p=new Producer(md);
	Consumer c=new Consumer(md);
	p.start();
	c.start();
	
}
}
