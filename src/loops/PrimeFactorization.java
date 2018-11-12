package loops;
import java.util.Scanner;
public class PrimeFactorization {
//not working
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a positive integer.");
int num = input.nextInt();
int count = 0;
int divisor=0;
int smallest = num;

System.out.print("Prime factorization: ");

while (smallest !=1)
{
for (count = num; count>0; count--)
{
	if (num%count==0)
	{
		divisor = count;
		if (divisor < smallest)
		{
			smallest = divisor;
			System.out.print(smallest+"  ");
		}
		
		
	}
}

	}

}
}
