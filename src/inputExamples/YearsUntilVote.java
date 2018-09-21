package inputExamples;
import java.util.Scanner;
public class YearsUntilVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int age = 999;
int years = 999;
System.out.println("What is your current age?");
age = input.nextInt();
years = 18 - age;
System.out.println("It is "+years+" year(s) until you can vote.");
	}

}
