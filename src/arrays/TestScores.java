package arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int[] score = new int[10];
int total = 0;
int big = 0;
int small = 9999999;

for (int counter=0; counter<score.length; counter++)
{
System.out.println("Enter a score.");
score[counter] = input.nextInt();
if (score[counter]>big)
{
	big = score[counter];
}
if (score[counter]<small)
{
	small = score[counter];
}
total = total+score[counter];
}
System.out.println("Highest score: "+big);
System.out.println("Lowest score: "+small);
System.out.println("Average: "+total/10.0);
System.out.println("Scores: ");
for (int counter = 0; counter <score.length; counter++) {
System.out.print(score[counter]+" ");
}
}
}
