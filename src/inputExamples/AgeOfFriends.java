package inputExamples;
import java.util.Scanner;
public class AgeOfFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double first = 999.0;
double second = 999.0;
double third = 999.0;
double average = 999.0;
System.out.println("What are the ages of 3 of your friends?");
first = input.nextInt();
second = input.nextInt();
third = input.nextInt();
average = (first + second + third)/3.0;
System.out.println("The average of the ages of your friends is "+average+" years.");
	}

}
