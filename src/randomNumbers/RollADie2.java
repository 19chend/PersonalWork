package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
Scanner input = new Scanner(System.in);

int max = 6;
int min = 1;
System.out.println("How many times do you want to roll the die?");
double times = input.nextInt();
double one = 0;
double two = 0;
double three = 0;
double four = 0;
double five = 0;
double six = 0;


for (int rolls = 1; rolls <= times; rolls++)
{
	int randomNumber = min + generator.nextInt(max - min + 1);
		if (randomNumber == 1)
		{
			one++;
		}
		if (randomNumber == 2)
		{
			two++;
		}
		if (randomNumber == 3)
		{
			three++;
		}
		if (randomNumber == 4)
		{
			four++;
		}
		if (randomNumber == 5)
		{
			five++;
		}
		if (randomNumber == 6)
		{
			six++;
		}
		}
System.out.println("Number of 1's: "+one+"\nNumber of 2's: "+two+"\nNumber of 3's: "+three+"\nNumber of 4's: "+four+"\nNumber of 5's: "+five+"\nNumber of 6's: "+six);
System.out.println("Percentages of rolls: "+"\n1: "+(one/times)*100+"%\n2: "+(two/times)*100+"%\n3: "+(three/times)*100+"%\n4: "+(four/times)*100+"%\n5: "+(five/times)*100+"%\n6: "+(six/times)*100+"%");		
input.close();	}
		

{
	}

}
