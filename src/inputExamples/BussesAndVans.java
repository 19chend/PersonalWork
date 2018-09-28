package inputExamples;
import java.util.Scanner;
public class BussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int people = 99;
int bus = 99;
int vanpeople = 99;
System.out.println("How many people are being transported?");
people = input.nextInt();
bus = people/35;
vanpeople = people - bus*35;
System.out.println("The number of busses need is "+bus+" busses and "+vanpeople+" people will be in vans.");

input.close();	}

}
