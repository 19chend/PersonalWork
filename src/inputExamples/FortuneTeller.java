package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int weight = 999;
int age = 999;
int number = 999;
System.out.println("Enter your weight, age, and lucky number.");
weight = input.nextInt();
age = input.nextInt();
number = input.nextInt();
System.out.println("Your fortune says that in "+number+" years, you will make $"+age+" per hour and live at "+weight+weight+ " Park Avenue.");
	}

}
