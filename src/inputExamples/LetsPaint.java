package inputExamples;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int length = -999;
int width = -999;
final int height = 8;
double gallons = -999.0;
double area = -999.0;
System.out.println("What is the length of the room in ft?");
length = input.nextInt();
System.out.println("What is the width of the room in feet?");
width = input.nextInt();
area = length * height * 2 + width * height * 2;
gallons = area/150.0;
System.out.println("Room dimensions:\nLength: "+length+" ft\nWidth: "+width+" ft");
System.out.println("Area: "+area+" ft squared");
System.out.println("Paint needed: "+gallons+" gallons");
	}

}
