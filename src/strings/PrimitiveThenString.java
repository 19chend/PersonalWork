package strings;
import java.util.Scanner;
public class PrimitiveThenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("What is your age?");
int age = input.nextInt();
input.nextLine();
System.out.println("What is your name?");
String name = input.nextLine();

System.out.println(age +"and" +name);
//Computer stops reading after hitting enter after age, input.next() will read the whitespace (enter key) so it skips over 
	}

}
