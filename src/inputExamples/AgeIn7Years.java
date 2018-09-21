package inputExamples;
import java.util.Scanner;
public class AgeIn7Years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int age = -999;
System.out.println("What is your age?");
age = input.nextInt();
age = age + 7;
System.out.println("Your age in 7 years will be "+age+" years.");
	}

}
