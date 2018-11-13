package strings;
import java.util.Scanner;
public class CommonMethodsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
/*
//charAt
System.out.println("Write a sentence.");
String sentence = input.nextLine();
System.out.println(sentence.charAt(0) +" "+sentence.charAt(2));
System.out.println(sentence);

//contains, is bob in the sentence
System.out.print(sentence.contains("bob"));

//compareTo
System.out.println("Enter a name.");
String name1= input.nextLine();
System.out.println("Enter a second name.");
String name2 = input.nextLine();

if (name1.compareTo(name2) < 0)
{
	System.out.println(name1+" comes before "+name2+" in the alphabet.");
	
}
if (name1.compareTo(name2) > 0)
{
	System.out.println(name2+" comes before "+name1+" in the alphabet.");
}
if (name1.compareTo(name2) == 0)
{
	System.out.println("The names are the same.");
	

//PROMPTS USER FOR SENTENCE AND DISPLAYS INDEX WHERE FIRST LETTER IS X
System.out.println("Enter a sentence.");
String sentence = input.nextLine();
System.out.println("Index where X appears: "+sentence.indexOf('X'));

//PROMPTS USER FOR SENTENCE AND DISPLAYS NUMBER OF CHARACTERS IN SENTENCE
System.out.println("Enter a sentence.");
String sentence = input.nextLine();
System.out.println("Number of characters in sentence: "+sentence.length());


//PROMPTS FOR SENTENCE AND DISPLAYS EACH CHARACTER ON NEW LINE
System.out.println("Enter a sentence.");
String sentence = input.nextLine();

for (int counter = 0; counter< sentence.length(); counter++)
	//cannot be <= because length is always 1 greater than greatest index
{
	System.out.println(sentence.charAt(counter));
	*/
//PROMPTS USER FOR SENTENCE, DISPLAYS IN ALL LOWERCASE LETTERS
System.out.println("Enter a sentence.");
String sentence = input.nextLine();
System.out.println(sentence.toLowerCase());
System.out.println(sentence);
}
}
	


