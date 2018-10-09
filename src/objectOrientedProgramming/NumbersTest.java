package objectOrientedProgramming;

public class NumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Numbers numbers = new Numbers();
numbers.sayNumber(7.5); 
numbers.sayNumberPlus2(10);
numbers.saySum(10,10);
double answer = numbers.returnSquare(10.0);
	System.out.println("The square of the value is "+answer);
double area = numbers.returnArea(10, 10);
System.out.println("The area of the rectangle is "+area);
double num = numbers.returnRoundUp(15.5);
System.out.println("The next largest integer is "+num);
	}


}
