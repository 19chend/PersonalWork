package arrays;
import java.util.Random;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle[] rec = new Rectangle[5];
Random generator = new Random();
int counter = 0;
int min = 10;
int max = 56;
int small = rec[0].area();
int smallindex =0;

for (counter = 0; counter < rec.length; counter++) {
	int length = min + generator.nextInt(max - min + 1);
	int width = min + generator.nextInt(max - min + 1);
	rec[counter] = new Rectangle(length, width);

	System.out.println("Width: "+rec[counter].getWidth());
	System.out.println("Length: "+rec[counter].getLength());
	System.out.println("Area: "+rec[counter].area());
	if (rec[counter].area() < small) {
		small = rec[counter].area();
		smallindex = counter;
	}
}
	System.out.println("Smallest area: "+small);
//make a new object to hold it while you switch the data(move smallest to first element)
	
Rectangle rec1 = rec[0];
rec[0]=rec[smallindex];
rec[smallindex]=rec1;


}
	}


