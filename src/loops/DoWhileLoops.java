package loops;
import java.util.Scanner;
public class DoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a number.");
int num = input.nextInt();
int largest = num;
int smallest = num;
/*
{
int product = num*17;
System.out.println("Magic number: "+product);
System.out.println("Please enter a number.(9999 to quit)");
num = input.nextInt();
}while (num !=9999);
	}}
*/
do {
	if (num > largest)
	{	largest = num;
	
}
	if (num < smallest)
	{ smallest = num;
	}


System.out.println("Please enter a number.(9999 to quit)");
num = input.nextInt();
}while (num !=9999);

System.out.println(largest-smallest);
}}

