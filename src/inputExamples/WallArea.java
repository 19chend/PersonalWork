package inputExamples;
import java.util.Scanner; 
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int height = 8;
int width = 999;
int area = 999;
System.out.println("What is the width in feet of the 8ft tall wall?");
width = input.nextInt();
area = height * width;
System.out.println("The wall has an area of "+area+" ft squared.");
input.close();	}

}
