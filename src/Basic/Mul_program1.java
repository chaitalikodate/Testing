package Basic;




class ProgramFirst implements Runnable{
	public void run() {
		int i=1;
		while(i<10) {
			System.out.println("hello i am from another"+i);
			i++;
		}
	}
	
}
public class Mul_program1 {
public static void main(String[] args) {
ProgramFirst p=new ProgramFirst();
Thread t=new Thread(p);
t.start();
int j=1;
while(j<10) {
	System.out.println("hello i am from main class"+j);
	j++;
	
}
}
}
