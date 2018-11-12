package loops;
import java.util.Scanner;
public class CountBy5 {
//WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a number to stop at.");
int limit = input.nextInt();
int num = 5;
while (num <= limit)
{
	System.out.println(num);
	num +=5;
}
	}

}
