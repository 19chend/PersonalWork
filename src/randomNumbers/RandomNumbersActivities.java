package randomNumbers;
import java.util.Random;
public class RandomNumbersActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Generate a random integer within the range low to high(inclusive)
Random generator = new Random(5);
/*
int min = 1;
int max = 2;
int heads = 0;
int tails = 0;
for (int counter = 1; counter<=100000; counter++)
{
	int randomNum = min + generator.nextInt(max - min +1);
	if (randomNum==1)
	{
		heads++;
	}
	else
	{
		tails++;
	}
}
System.out.println("Number of heads: "+heads+"\nNumber of tails: "+tails);
	
	}

}

//How many times a multiple of 3 was rolled on a 13 sided dice
int min = 1;
int max = 13;
int count =0;
for (int rolls = 1; rolls <=87; rolls++)
{
	int randomNum = min + generator.nextInt(max - min +1);
	if (randomNum%3 == 0)
	{
		count++;
	}
}
System.out.println("Times a multiple of 3 was rolled: "+count);
	}
}
*/
//students of 248 first graders and how many were more than 3ft tall
int min = 26;
int max = 43;
int count = 0;

for (int student = 1; student <=248; student++)
{
	int randomNum = min + generator.nextInt(max - min +1);
	if (randomNum > 36)
	{
		count++;
	}
}
System.out.println(count+" students are greater than 3ft tall.");
	}
}



