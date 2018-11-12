package loops;
import java.util.Scanner;
public class LoopsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int count = 0;
while (count <=100)
{
	System.out.println(count);
	count++;
}

int num = 0;
while (num <=100000)
{
	System.out.println(num);
	num=num+2;
}
Scanner input = new Scanner(System.in);
System.out.println("Which number would you like to stop at?");
int limit = input.nextInt();
int num = 0;
while (num <=limit)
{
	System.out.println(num);
	num = num+2;
}
Scanner input = new Scanner(System.in);
System.out.println("Which number would you like to stop at?");
int limit = input.nextInt();
int num = 0;
int sum = -99;

while (num <=limit)
{
	sum+=num;
	num+=2;
}
System.out.println(sum);
	}
Scanner input = new Scanner(System.in);
System.out.println("Please enter a number. (9999 to quit)");
int num = input.nextInt();

while (num != 9999)
{
	System.out.println("Your number times 2 is: "+num*2);
	System.out.println("Please enter a number. (9999 to quit)");
	num = input.nextInt();
}

	}
}

Scanner input = new Scanner(System.in);
System.out.println("Please enter a value (9999 to quit)");

double num = input.nextDouble();
double sum = 0;
int inputs = 0;

while (num !=9999)
{
	sum+=num;
	System.out.println("Please enter a value (9999 to quit)");
	num = input.nextDouble();
	inputs++;
}
System.out.println("average: "+sum/inputs);

	}
}
*/
		//Displaying largest value user entered
Scanner input = new Scanner(System.in);
System.out.println("Please enter a value (9999 to quit)");
double num = input.nextDouble();
double big = 0;
while (num !=9999)
{
	if (num>big)
	{
		big = num;
	}
	System.out.println("Please enter a value (9999 to quit)");
	num = input.nextDouble();
}
	System.out.println("The largest int entered: "+big);
	}
}
	
	

	
	
	
	
	
	
	