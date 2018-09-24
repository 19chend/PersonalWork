package inputExamples;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int numerator = -999;
int denominator = -999;
int answer = -999;
int remainder = -999;
System.out.println("What are the numerator and denominator with a space inbetween?");
numerator = input.nextInt();
denominator = input.nextInt();
answer = numerator/denominator;
remainder = numerator%denominator;
System.out.println(numerator+" divided by "+denominator+ " is "+answer+"r"+remainder+"."); 

	}

}
