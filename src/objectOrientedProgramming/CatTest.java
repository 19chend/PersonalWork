package objectOrientedProgramming;
import java.util.Scanner;
public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Cat bob = new Cat();
int age = -999;
int sleep = -999;
System.out.println("What is the age of the cat?");
age = input.nextInt();
System.out.println("How many hours of sleep does the cat get?");
sleep = input.nextInt();
bob.sleepMore();
System.out.println("Sleeping more is "+sleep+" hours");
bob.sleepLess();
System.out.println("Sleeping less is "+sleep+" hours");
bob.birthday();
	}

}
