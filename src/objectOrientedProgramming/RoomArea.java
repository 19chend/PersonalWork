package objectOrientedProgramming;
import java.util.Scanner;
public class RoomArea {
public RoomArea(){
}
public void area(){
Scanner input = new Scanner(System.in);
int length = 999;
int height = 999;
int area = 999;
System.out.println("What is the length of the wall in ft?");
length = input.nextInt();
System.out.println("What is the height of the wall in ft?");
height = input.nextInt();
area = length * height;
System.out.println("The area of the wall in the room is "+area+" ft squared");
}

public void areaWithDoor(){
Scanner input = new Scanner(System.in);
int length = 999;
int width = 999;
int area = 999;
int doorwidth = 999;
int doorheight = 999;
System.out.println("What is the length of the wall in ft?");
length = input.nextInt();
System.out.println("What is the width of the wall in ft?");
width = input.nextInt();
System.out.println("What is the height of the door in ft?");
doorheight = input.nextInt();
System.out.println("What is the width of the door in ft?");
doorwidth = input.nextInt();
area = (length*width)-(doorwidth*doorheight);
System.out.println("The area of the wall removing the door is "+area+" ft squared");
input.close();}
}
