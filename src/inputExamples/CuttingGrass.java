package inputExamples;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double length = -999.0;
double width = -999.0;
double radius = -999.0;
double arealawn = -999.0;
double areafountain = -999.0;
double areafinal= -999.0;
double cost = -999.0;
System.out.println("What is the length of the lawn in yards?");
length = input.nextDouble();
System.out.println("What is the width of the lawn in yards?");
width = input.nextDouble();
System.out.println("What is the radius of the fountain in feet?");
radius = input.nextDouble();
radius = radius/3.0;
arealawn = length * width;
areafinal =  arealawn - (radius*radius*Math.PI);
areafinal = areafinal*9;
cost = areafinal/100*1.25;
System.out.println("The lawn area cut is "+areafinal+" squared ft.");
System.out.println("The cost of cutting the lawn is $"+cost+".");


	}

}
