package objectOrientedProgramming;

import java.util.Scanner;

public class HomeImprovement {
public HomeImprovement(){
}
public void paintAWall(){
Scanner input = new Scanner(System.in);
double length = -999.0;
double height = -999.0;
double area = -999.0;
double time = -999.0;
System.out.println("What is the length of the wall in ft?");
length = input.nextDouble();
System.out.println("What is the height of the wall in ft?");
height = input.nextDouble();
area = length*height;
time = area*60.0/200.0;
System.out.println("It will take "+time+" mintes to paint the wall.");
}
public void plantTheGarden(){
Scanner input = new Scanner(System.in);
final double WIDTH = 10.0;
double length = -999.0;
double area = -999.0;
double time = -999.0;
System.out.println("What is the length of the garden in ft?");
length = input.nextDouble();
area = length * WIDTH;
time = area/7.5;
System.out.println("It will take "+time+" hours to plant the garden.");
}
public void fillThePool(double radius, double height){
double area = -999.0;
double time = -999.0;
area = (radius*radius*Math.PI)*height;
area = area * 7.48052;
time = area/300.0;
System.out.println("It will take "+time+" hours to fill the pool.");
}
}
