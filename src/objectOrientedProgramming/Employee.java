package objectOrientedProgramming;

public class Employee {
	private double wage;
	private int experience;
public Employee(){
wage = 11;
experience = 10;
}	
public double getWage(){
	return wage;
}
public void setWage(double newWage){
	wage = newWage;
}
public int getExperience(){
	return experience;
}
public void setExperience(int newExperience){
	experience=newExperience;
}
public void raiseWage(){
	wage = wage *1.1;

}
}