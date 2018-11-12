package loops;
import java.util.Scanner;
public class Factorial {
//FOR LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a positive integer.");
int num = input.nextInt();
int product = 1;

if (num<0)
{
	num=-num;
}

for (int count = num; count >=1;count--)
{
	product = product*count;
	
}
System.out.println(num+"! = "+product);

	}
	
}
