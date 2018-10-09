package objectOrientedProgramming;
import java.util.Scanner;
public class SandboxTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
//VERSION 1
	{
Sandbox version1 = new Sandbox();
version1.bob();
	
//VERSION 2
Sandbox version2 = new Sandbox();
Scanner input = new Scanner(System.in);
int length = -999;
int width = -999;
int depth = -999;
System.out.println("What is the length, width, and depth of the sandbox in LL WW DD form?(ft)");
length = input.nextInt();
width = input.nextInt();
depth = input.nextInt();
System.out.println("What is the amount of sand in cubic feet that can be transported per hour?");
double sand = -999.0;
sand = input.nextDouble();
double hours = -999.0;
hours = (length*width*depth)/sand;
version2.john(hours);

//VERSION 3

Sandbox version3 = new Sandbox();
int length3 = -999;
int width3 = -999;
int depth3 = -999;
System.out.println("What is the length, width, and depth of the sandbox in LL WW DD form?(ft)");
length3 = input.nextInt();
width3 = input.nextInt();
depth3 = input.nextInt();
System.out.println("What is the amount of sand in cubic feet that can be transported per hour?");
double sand3 = -999.0;
sand3 = input.nextDouble();
double hours3=-999.0;
version3.billy(length3, width3, depth3, sand3);
System.out.println("It will take "+hours3 +" hours to fill the sandbox");

	}
	}
}
