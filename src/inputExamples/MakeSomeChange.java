package inputExamples;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double cash = -999.0;
int dollars = -999;
double change = -999.0;
double quarters = -999.0;
double dimes = -999.0;
double nickels = -999.0;
double pennies = -999.0;
System.out.println("How much money would you like to make change for?");
cash = input.nextDouble();
dollars = (int)cash;
change = cash - dollars;
quarters = change/.25;
quarters = (int)quarters; 
change = change - (quarters *.25);
dimes = change/.1;
dimes = (int)dimes;
change = change - dimes * .1;
nickels = change/.05;
nickels = (int)nickels;
change = change - nickels * .05;
pennies = change/.01;
pennies = (int)pennies;
System.out.println("Your change is: ");
System.out.println("Dollars: "+dollars);
System.out.println("Quarters: "+quarters);
System.out.println("Dimes: "+dimes);
System.out.println("Nickels: "+nickels);
System.out.println("Pennies: "+pennies);


input.close();	}

}
