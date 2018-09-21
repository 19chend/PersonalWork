package inputExamples;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean vote = false;
Scanner input = new Scanner(System.in);
System.out.println("You have voted.");
vote = input.nextBoolean();
System.out.println("The statement is "+ vote + ".");
	}

}
