package arrays;
import java.util.Random;
import java.util.Scanner;
public class RollADieExtension {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
int[] roll = new int[10];
Random generator = new Random();
int min = 1;
int max = 6;
int counter = 0;
int num = 9999;


System.out.println("What roll value desired?");
num = input.nextInt();
System.out.println("Rolls with that number: ");
do {
		for (counter = 0; counter<roll.length; counter++ ) 
		{	
		int randomNum = min + generator.nextInt(max - min + 1);
		roll[counter] = randomNum;
		if (roll[counter] == num) {
			System.out.println(counter);
		}
		}
		System.out.println("What roll value desired? 9999 to quit.");
		num = input.nextInt();
		
		}while (num!=9999);

			

		

}	
}

