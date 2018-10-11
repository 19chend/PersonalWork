package objectOrientedProgramming;

public class Rectangle {
private double length;
private double width;

public Rectangle(){	
}
public Rectangle(double length, double width) {
	
}
public double returnLength() {
	return length;
}
public double returnWidth() {
	return width;
}
public double perimeter() {
	double perimeter = -999.0;
	perimeter = 2*(length+width);
	return perimeter;
}
public double area() {
	double area = -999.0;
	area = length*width;
	return area;
}
public void changeLength() {
	double newLength = 10.0;
	length = newLength;
}
public void changeWidth() {
	double newWidth = 12.0;
	width = newWidth;
}
}


