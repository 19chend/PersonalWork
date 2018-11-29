package arrays;
import java.util.Scanner;
import java.util.Random;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int[] roll = new int[10000];
Random generator = new Random();
int min = 1;
int max = 6;
int counter = 0;
int num = 9999;



for (counter = 0; counter<roll.length; counter++ ) 
{	
int randomNum = min + generator.nextInt(max - min + 1);
roll[counter] = randomNum;
}
do {
System.out.println("What roll number? 9999 to quit.");
num = input.nextInt();
if (num !=9999) {
System.out.println(roll[num]);
}
}while (num!=9999);

	

}}
