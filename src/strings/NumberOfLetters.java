package strings;
import java.util.Scanner;
public class NumberOfLetters {
//EHY DOESNT THIS WORK
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a sentence.");
String sentence = input.nextLine();
int vowels = 0;
int counter = 0;
int punc = 0;
int spaces =0;

for (counter = 0; counter < sentence.length(); counter++);
{
	if (sentence.charAt(counter)== 'a' ||sentence.charAt(counter)=='e' ||sentence.charAt(counter)== 'i' || sentence.charAt(counter)== 'o' ||sentence.charAt(counter)== 'u') {
		vowels++;
	}
	if (sentence.charAt(counter)== '.'||sentence.charAt(counter)=='!'||sentence.charAt(counter)=='?') {
		punc++;
	}
	if (sentence.charAt(counter)== ' ') {
		spaces++;
	}
}
System.out.println("Number of vowels: "+vowels);
System.out.println("Number of consonants: "+(sentence.length() - 1 - spaces - punc - vowels));
System.out.println("Number of punctuation marks: "+punc);
	
	}
}
