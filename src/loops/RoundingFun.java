package loops;
import java.util.Scanner;
public class RoundingFun {
//WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a 4 digit integer. 9999 to quit");
int num = input.nextInt();

while (num != 9999)
{
	System.out.println(num+".00");
	System.out.println("Enter a 4 digit integer. 9999 to quit");
	num = input.nextInt();
}
	}

}
