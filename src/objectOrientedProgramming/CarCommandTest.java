package objectOrientedProgramming;
import java.util.Scanner;
public class CarCommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int miles = -999;
System.out.println("How many miles are on the car?");
miles = input.nextInt();
CarCommands car = new CarCommands();
car.sayOdometer(miles);
car.sayFlat();
car.sayThirsty();
input.close();	}

}
