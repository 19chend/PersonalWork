package objectOrientedProgramming;

import java.util.Scanner;

public class Sandbox {
public Sandbox() {
}

public void bob() {
Scanner input = new Scanner(System.in);
int length = -999;
int width = -999;
int depth = -999;
System.out.println("What is the length, width and depth of the sandbox in LL WW DD form (ft)?");
length = input.nextInt();
width = input.nextInt();
depth = input.nextInt();
System.out.println("What is the amount of sand in cubic feet that can be transported per hour?");
double sand = -999.0;
sand = input.nextDouble();
double hours = -999.0;
hours = (length*width*depth)/sand;
System.out.println("It will take "+hours+" hours to fill the sandbox with sand.");
}

public void john(double hours) {
System.out.println("It will take "+hours+" hours to fill the sandbox with sand.");
}
public double billy(double length3, double width3, double depth3, double sand3) {
	double hours3 = -999.0;
	hours3 = (length3*width3*depth3)/sand3;
	return hours3;
}
}
