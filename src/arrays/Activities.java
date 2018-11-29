package arrays;
import java.util.Scanner;
import java.util.Random;
public class Activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

/*
//PROMPT USER FOR 5 TEST SCORES AND STORE THEM IN ARRAY
int[] values = new int[5];
int counter;
for (counter = 0; counter <= 4; counter++) {
System.out.println("Enter a value");
values[counter] = input.nextInt();

}
System.out.println("Array: ");
System.out.print(values[4]);
	}

//PROMPT USER FOR 5 TEST SCORES, STORE THEM IN ARRAY, DISPLAY SUM OF THE VALUES IN THE ARRAY
int[] values = new int[5];
int counter;
int total = 0;
for (counter = 0; counter < values.length; counter++) {
System.out.println("Enter a value");
values[counter] = input.nextInt();
total += values[counter];

}
System.out.println("Sum: "+total);

}
	
//PROMPT USER FOR 25000 SCORES AND STORE IN 1 DIMENSIONAL ARRAY--DOESNT WORK
int maxStudents = 5;
int[] values = new int[5];
int counter;
for (counter = 0; counter <maxStudents; counter++) {
System.out.println("Enter a value");
values[counter] = input.nextInt();

for (counter = maxStudents-1; counter >=0; maxStudents--)
System.out.print(values[counter]);

}


Random generator = new Random();
int min = 0;
int max = 1000;
double[] testscores = new double[250];
int big = 0;

for (int counter = 0; counter <250; counter++) {
int randomNum = min + generator.nextInt(max -min+1);
	if (randomNum > big) {
		big = randomNum;
	}
}
System.out.println("Largest score: "+big);


//DECLARE AN ARRAY OF 20 NAMES AFTER PROMPTING, DISPLAY NAMES IN REVERSE ORDER

String[] names = new String[5];
int counter;
for (counter = 0; counter <names.length; counter++) {
System.out.println("Enter a name");
names[counter] = input.nextLine();

}
for (counter = names.length-1; counter >=0; counter--)
System.out.println(names[counter]);
}


//WITH 20 NAMES FROM ABOVE, PROMPT USER FOR LETTER AND DISPLAY NAMES THAT END WITH LETTER
String[] names = new String[5];
int counter;
for (counter = 0; counter <names.length; counter++) {
System.out.println("Enter a name");
names[counter] = input.nextLine();
}
System.out.println("Enter a letter.");
String letter = input.next();
char letter1 = letter.charAt(0);

for (counter = 0; counter<names.length; counter++) {
int last = (names[counter].length());
char lastletter = names[counter].charAt(last - 1);
if (lastletter==letter1) {
	System.out.println(names[counter]);
*/	

//WITH 20 NAMES FROM ABOVE, PROMPT USER FOR DESIRED LENGTH AND DISPLAY HOW MANY NAMES HAVE THE DESIRED LENGTH
String[] names = new String[5];
int counter;
for (counter = 0; counter <names.length; counter++) {
System.out.println("Enter a name");
names[counter] = input.nextLine();
}

int total = 0;
System.out.println("What is the desired first name length?");
int length = input.nextInt();

for (counter =0; counter<names.length; counter++) {
if (names[counter].length()==length) {
	total++;
}
	
}
	System.out.println(total+" names have the desired length.");
}


}
