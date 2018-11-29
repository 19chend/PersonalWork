package arrays;
import java.util.Scanner;
import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 DIMENSIONAL
Scanner input = new Scanner(System.in);
Random generator = new Random();
int[] random = new int[10000];
int counter = 0;
int min = 0;
int max = 100;
int total = 0;

System.out.println("Enter an integer 1 to 100.");
int num = input.nextInt();

do {
for (counter = 0; counter < random.length; counter++) {
	int randomNum = min + generator.nextInt(max - min + 1);
	random[counter] = randomNum;
	if (random[counter] == num) {
		total++;
	}
}
System.out.println("Number of times integer is in the array: "+total);
System.out.println("Enter an integer 1 to 100. 9999 to quit");
num = input.nextInt();
}while(num !=9999);
	}

}
