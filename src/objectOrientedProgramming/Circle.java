package objectOrientedProgramming;

public class Circle {
private double radius;
public Circle(){
	radius = -999.0;
}
public Circle(double newRadius){
	radius = newRadius;
}
public double returnRadius(){
	return radius;
	
}
public double circumference(){
	double circumference = -999.0;
	circumference = radius*2*Math.PI;
	return circumference;
}
public double area(){
	double area = -999.0;
	area = Math.PI*radius*radius;
	return area;
}
public void changeRadius(){
	double newRadius = -999.0;
	radius = newRadius;
}
}