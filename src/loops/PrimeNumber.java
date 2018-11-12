package loops;
import java.util.Scanner;
public class PrimeNumber {
//FOR LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a number.");
int num = input.nextInt();
int divisors = 0;

for (int count = 1; count <=num; count++)
{
	if (num%count==0)
	{
		divisors++;
	}
}
if (divisors > 2)
{
	System.out.println("It is not a prime number.");
}
else
{
	System.out.println("It is a prime number.");
}
	}

}
