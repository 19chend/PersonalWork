package loops;
import java.util.Scanner;
public class TestScores {
//WHILE LOOPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a test score. All scores above 70 are passing. 9999 to quit.");
double score = input.nextDouble();
double sum = 0;
double average = 0;
int counter = 0;

while (score != 9999)
{
	if (score > 70)
	{
		sum = sum + score;
		counter++;
	}

System.out.println("Enter a test score. All scores above 70 are passing. 9999 to quit.");
score = input.nextDouble();
}
average = sum/counter;
System.out.println("Sum of passing tests: "+sum+"\nAverage of passing: "+average);
	}

}
