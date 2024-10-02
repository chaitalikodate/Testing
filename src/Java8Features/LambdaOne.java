package Java8Features;

interface Boy{
	public void display();
	
}
public class LambdaOne {
	
	public static void Bottle() {
		System.out.println("hello this is chaitali");
	}
	public static void main(String[] args) {
		Boy boy=LambdaOne::Bottle;
		boy.display();
	
}
}
