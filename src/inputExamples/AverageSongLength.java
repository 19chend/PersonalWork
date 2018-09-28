package inputExamples;
import java.util.Scanner;
public class AverageSongLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double songs = -999.0;
double averagemin = -999.0;
double minutes = -999.0;
double seconds = -999.0;
double averagesec = -99.0;
System.out.println("How many songs are on the device?");
songs = input.nextDouble();
System.out.println("What is the total length of songs in MM SS format?");
minutes = input.nextDouble();
seconds = input.nextDouble();
seconds = seconds/60.0;
averagemin = minutes/songs;
averagesec = seconds/songs;
averagesec = averagesec*60;
System.out.println("The average song length is "+averagemin+" minutes and "+averagesec+" seconds.");
input.close();}

}
