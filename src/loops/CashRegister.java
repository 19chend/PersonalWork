package loops;
import java.util.Scanner;
public class CashRegister {
//FOR LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How many items did you buy?");
int  items = input.nextInt();
double total = 0;
double cost = 0;

for (int counter = 1; counter <= items; counter ++)
{
	System.out.println("Enter the cost of the item.");
	cost = input.nextDouble();
	total = total+cost;
}
System.out.println("Total: "+total+"\nTax (5%): "+(total*.05)+"\nTotal w/ 5% tax: "+(total*1.05));

}
}