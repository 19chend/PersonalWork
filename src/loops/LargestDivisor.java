package loops;
import java.util.Scanner;
public class LargestDivisor {
//FOR LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a positive integer.");
int num = input.nextInt();
int big = 0;
int divisor = 0;


for (int count = 1; count<num; count++)
{
	if (num%count==0)
	{
		divisor = count;
		if (divisor >= big)
		{
			big = divisor;
		}
	}
}
System.out.println("Largest divisor: "+big);
}

	}


