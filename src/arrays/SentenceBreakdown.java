package arrays;
import java.util.Scanner;
public class SentenceBreakdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a sentence.");
String sentence = input.nextLine();
String sentence1 = sentence.toLowerCase();

char[] bobo = new char[sentence1.length()];
System.out.println("Number of:");
for (int counter = 0; counter < sentence1.length(); counter++) {
	bobo[counter] = sentence1.charAt(counter);
	
	
}


	}

}
