package arrays;
import java.util.Scanner;
import java.util.Random;
public class SplitActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//displays first letter of each word in a sentence on a separate line

		Scanner input = new Scanner(System.in);
/*
System.out.println("Enter a sentence.");
String sentence = input.nextLine();

String[] words = sentence.split(" ");

System.out.println("First letter of each word: ");
for(int counter = 0; counter < words.length; counter++) {
	System.out.println(words[counter].charAt(0));
}

//prompts for sentence and key word, displays how many times key word appears in sentence
System.out.println("Enter a sentence.");
String sentence = input.nextLine();
System.out.println("Enter a key word.");
String key = input.nextLine();
String[] words = sentence.split(" ");

int total = 0;
for (int counter = 0; counter < words.length; counter++) {
	if (words[counter].compareToIgnoreCase(key) == 0) {
		total++;
	}
}
System.out.println("Number of times key word is in sentence: "+total);
*/
		
//prompts for sentence and displays random word in the sentence
Random generator = new Random();
System.out.println("Enter a sentence.");
String sentence = input.nextLine();

String[] words = sentence.split(" ");
int min = 0;
int max = words.length - 1;
int randomIndex = min + generator.nextInt(max - min + 1);

System.out.println(words[randomIndex]);
	}

}
