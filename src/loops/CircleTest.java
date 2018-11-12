package loops;
import java.util.Scanner;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is the radius of the first, second, and third circle in FF SS TT form?");
double first = input.nextDouble();
double second = input.nextDouble();
double third = input.nextDouble();
double radius = 0;


do
{
if (first >= second && first>= third)
{
	radius = first;
}
if (second >= first && second>= third)
{
	radius = second;
}
if (third >=first && third >=second)
{
	radius = third;
}
Circle bob = new Circle(radius);
System.out.println("Circumference of biggest circle: "+bob.circumference());
System.out.println("What is the radius of the first, second, and third circle in FF SS TT form? If you would like to quit, enter 9999.");
first = input.nextDouble();
second = input.nextDouble();
third = input.nextDouble();
	}while (first !=9999);




	}

}
