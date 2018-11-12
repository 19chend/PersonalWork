package loops;
import java.util.Scanner;
public class Cube {
//WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a number to cube. (-1 to quit)");
int num = input.nextInt();

while (num != -1)
{
	System.out.println("Cube: "+(num*num*num));
	System.out.println("Please enter a number to cube. (-1 to quit)");
	num = input.nextInt();
}
	}

}
