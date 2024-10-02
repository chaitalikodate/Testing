package Basic;

class Display{
synchronized  void display(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
}
class Demo2 extends Thread{
	
	Display d;
	public Demo2(Display data) {
		this.d=data;
	}
	public void run() {
		d.display("Hello World");
	}
	
}
class Demo1 extends Thread{
	
	Display d;
	public Demo1(Display data) {
		this.d=data;
	}
	public void run() {
	  d.display("Congratulation");
	}
	
}
public class Mul_Program5 {
	public static void main(String[] args) {
		Display d=new  Display();
		Demo2 d2=new Demo2(d);
		Demo1 d1=new Demo1(d);
		d2.start();
		d1.start();
		
	}

}
