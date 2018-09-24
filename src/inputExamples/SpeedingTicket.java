package inputExamples;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
final int initial = 55;
final int fee = 40;
int total = -999;
int limit = -999;
int speed = -999;
int difference = -999;
System.out.println("What was the speed limit?");
limit = input.nextInt();
System.out.println("How fast was the driver driving?");
speed = input.nextInt();
difference = speed - limit;
total = (difference - 1) * 40 + initial;
System.out.println("Speed limit: "+limit+"\n"+"Driver's speed: "+speed+"\n"+"Cost of ticket: $"+total);
	}

}
