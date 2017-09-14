import java.util.Scanner;

public class MyRobot {

	
	public MyRobot()
	{
	}
	
	public void sleep()
	{
		System.out.println("I am asleep, please don't disturb");
	}
	
	public void eat(String food)
	{
		if (food.equals("apple")==true)
			System.out.println("thank you");
		else
			System.out.println("mmmm...I don't like it");
	}
	
	public void toilet()
	{
		System.out.println("I am busy right now");
	}
	
	public void addNumbers (double number1, double number2)
	{
		double sum=number1+number2;
		System.out.println("The sum of the 2 numbers: "+number1+", "+number2+" is:  "+sum);
	}
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		MyRobot Groovy=new MyRobot();
		
		Groovy.sleep();
		
		System.out.println("get me some food");
		String input=reader.next();
		Groovy.eat(input);
		
		double num1, num2;
		System.out.println("please insert first number");
		num1=reader.nextDouble();
		System.out.println("please insert second number");
		num2=reader.nextDouble();
		Groovy.addNumbers(num1,  num2);
		
		

	}

}
