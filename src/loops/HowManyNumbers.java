package loops;
import java.util.Scanner;
public class HowManyNumbers {
//DO WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a number.");
int num = input.nextInt();
int sum = 0;
int counter = 0;

do 
{
	sum = sum+num;
	System.out.println("Enter another number.");
	num = input.nextInt();
	counter++;
}while (sum<2018);

System.out.println(counter+" numbers were entered when greater than 2018.");
	}

}
