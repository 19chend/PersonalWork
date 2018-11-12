package loops;
import java.util.Scanner;
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
for (int col = 1; col<=4; col++)
{
for (int row =1; row <=5;  row = row++)
{
	System.out.println(row*col);
}
System.out.println();
	
	
	}
	}

}
for (int j=1; j<= 4; j++)
for (int i = 1; i <= 5; i = i++)
{
	if (i!=3)
		System.out.print(i+"     ");
	else
		System.out.print(j+"     ");
}
}}

*/
Scanner input = new Scanner(System.in);
System.out.println("Enter a number.");
int num = input.nextInt();
for (int counter = 1; counter<=num;counter = counter++)	
{
	if (num%counter==0)
	System.out.println(counter);
}}
}
	
	