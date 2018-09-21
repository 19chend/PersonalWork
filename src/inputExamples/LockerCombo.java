package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int first = 999;
int second = 999;
int third = 999;
System.out.println("What are the 3 numbers in your locker combination?");
first = input.nextInt();
second = input.nextInt();
third = input.nextInt();
System.out.println("Your locker combination is "+first+ "-"+second+"-"+third);
		
	}

}
