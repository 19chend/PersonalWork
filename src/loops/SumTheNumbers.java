package loops;
import java.util.Scanner;
public class SumTheNumbers {
//DO WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
System.out.println("Enter 2 numbers in 00 00 form.");
int first = input.nextInt();
int second = input.nextInt();
int sum = 0;

do
{
	sum = first+second;
	System.out.println("Sum: "+sum);
	System.out.println("Enter 2 more numbers or quit by typing 999.");
	first = input.nextInt();
	second = input.nextInt();
}while (first != 999);
	
	}

}
