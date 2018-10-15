package objectOrientedProgramming;
import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//Rectangle
double length = -999.0;
double width = -999.0;
System.out.println("What are the length and width of the rectangle in LL WW form?");
length = input.nextDouble();
width = input.nextDouble();
Rectangle sab = new Rectangle(length, width);
System.out.println("Area of rectangle: "+sab.area());
System.out.println("Perimeter of rectangle: " +sab.perimeter());

//Circle
double radius = -999.0;
System.out.println("What is the radius of the circle?");
radius = input.nextDouble();
Circle saab = new Circle(radius);
System.out.println("Area of the circle: "+saab.area()+"\nCircumference: "+saab.circumference());

//Right triangle
double base = -999.0;
double height = -999.0;
System.out.println("What are the base and height of the triangle in BB HH form?");
base = input.nextDouble();
height = input.nextDouble();
RightTriangle saaab = new RightTriangle(base, height);
System.out.println("Area of triangle: "+saaab.area()+"\nPerimeter of triangle: "+saaab.perimeter());

//Trapezoid
double base1 = -999.0;
double base2 = -999.0;
double height1 = -999.0;
double leg = -999.0;
System.out.println("What are the base lengths of the trapezoid in B1 B2 form?");
base1 = input.nextDouble();
base2 = input.nextDouble();
System.out.println("What is the height and length of the leg in HH LL form?");
height1 = input.nextDouble();
leg = input.nextDouble();
IsoscelesTrapezoid saaaab = new IsoscelesTrapezoid(base1, base2, height1, leg);
System.out.println("Area of trapezoid: "+saaaab.getArea()+"\nPerimeter of trapezoid: "+saaaab.getPerimeter());
	}

}
