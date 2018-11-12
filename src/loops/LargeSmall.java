package loops;
import java.util.Scanner;
public class LargeSmall {
//WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a test score. 9999 to quit.");
double score = input.nextDouble();
double big = 0;
double small = 9999999999999999.0;

while (score != 9999)
{
	if (score > big)
	{
		big = score;
	}
	if (score < small)
	{
		small = score;
	}
	System.out.println("Enter a test score. 9999 to quit.");
	score = input.nextDouble();
}
System.out.println("Largest score: "+big+"\nSmallest score: "+small);
	}

}
