package objectOrientedProgramming;

public class Numbers {
public Numbers(){
	
}
public void sayNumber(double num){
	System.out.println("Your number is "+num);
}
public void sayNumberPlus2(double num){
	num = num+2;
	System.out.println("Your number plus 2 is "+num);
}
public void saySum(double num1, double num2){
System.out.println("The sum of your numbers is "+(num1+num2));
}
public double returnSquare(double num){
	num = Math.pow(num,2.0);
	return num;
}
public double returnArea(double num1, double num2){
	double area = -999.0;
	area = num1*num2;
	return area;
}
public int returnRoundUp(double num){
	num = (int)Math.ceil(num);
	return (int)num;
}
	
}


