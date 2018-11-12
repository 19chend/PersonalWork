package loops;
import java.util.Scanner;
public class SumofOdd {
//FOR LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a positive integer.");
int lim = input.nextInt();
 if (lim<0)
 {
	 lim = -lim;
 }
int total=0;

for (int num =1; num <=lim; num+=2)
{
	total = total+num;
}
System.out.println("Total of odd integers below "+lim+": "+total);
	}

}
