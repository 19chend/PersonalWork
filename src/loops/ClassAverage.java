package loops;
import java.util.Scanner;
public class ClassAverage {
//FOR LOOPS
	public static void main(String[] args) {

		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How many students are there in the class?");
int students = input.nextInt();
double sum = 0;
double score = 0;

for (int counter = 1; counter<=students; counter++)
{
	System.out.println("Enter a test score.");
	score = input.nextDouble(); 
	sum = sum+score;
}
System.out.println("Class average: "+sum/students);


}
}
