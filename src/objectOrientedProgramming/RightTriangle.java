package objectOrientedProgramming;

public class RightTriangle {
private double base;
private double height;
public RightTriangle() {
	base = -999.0;
	height = -999.0;
}
public RightTriangle(double newBase, double newHeight) {
	base = newBase;
	height = newHeight;
}
public double getHypot() {
	double hypot = Math.sqrt((base*base)+(height*height));
	return hypot;
}
public double perimeter() {
	double perimeter = Math.sqrt((base*base)+(height*height))+base+height;
	return perimeter;
}
public double area() {
	double area = base*height*0.5;
	return area;
}
}
