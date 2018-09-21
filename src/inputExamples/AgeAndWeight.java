package inputExamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int age = 999;
double weight = 999.0;
System.out.println("What is your age and weight?");
age = input.nextInt();
weight = input.nextDouble();
System.out.println("You are "+age+" years old and weigh "+weight+" pounds.");

	}

}
 