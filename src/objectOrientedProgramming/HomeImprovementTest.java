package objectOrientedProgramming;
import java.util.Scanner;
public class HomeImprovementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
HomeImprovement bob = new HomeImprovement();
bob.paintAWall();
bob.plantTheGarden();
System.out.println("What is the radius and height of the pool in RR HH form?(ft)");
double radius = -999.0;
double height = -999.0;
radius = input.nextDouble();
height = input.nextDouble();
bob.fillThePool(radius, height);
	}

}
