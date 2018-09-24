package inputExamples;
import java.util.Scanner;
public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double radius = -999.0;
double volume = -999.0;
System.out.println("What is the radius of the sphere?");
radius = input.nextDouble();
volume = 4.0/3.0 * Math.PI*radius*radius*radius;
System.out.println("The volume of the sphere is "+volume+" units cubed.");


	}

}
