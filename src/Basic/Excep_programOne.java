package Basic;
class NotDivideZero extends Exception{
	public String toString() {
		return "Please dont divide by zero";
	}
}


class ExceOne {
	public static void fun3(){
		int c;
		try {
			
		 throw new NotDivideZero();
		}
		catch(NotDivideZero z ) {
			System.out.println(z);
		}
		 
	}
	
	public static void fun2() {
		fun3();
	}
	public static void fun1(){
		fun2();
	}
}

public class Excep_programOne {
	public static void main(String[] args)throws NotDivideZero {
	
		ExceOne. fun1();
		
	}

}
