package arrays;
import java.util.Scanner;
import java.util.Random;
public class CrazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double[] price = new double[5];
Random generator = new Random();
int min = 0;
int max = 100;
int counter = 0;

for (counter = 0; counter <price.length; counter++) {
	System.out.println("Enter the price of item number "+counter+":");
	price[counter] = input.nextDouble();
}
for (counter = 0; counter <price.length; counter++) {
	int randomNum = min + generator.nextInt(max - min + 1);
	System.out.println("Sale! Percentage off item #"+counter+":"+(randomNum));
	System.out.println("New cost: "+(price[counter] - price[counter]*(randomNum/100.0)));
}
	}

}
