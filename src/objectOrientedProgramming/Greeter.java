package objectOrientedProgramming;
//import statements at the top
public class Greeter {
//instance fields - data storage
	private int age;
//constructors - methods for constructing the object
	
//default constructor
public Greeter()
{
	//statements to initialize the state of the object
	age = 17;
}
//methods - things the object can do
public void sayHello()
{
	System.out.println("Hello");
}
public int getAge(){
	return age;
}
public void setAge(int newAge){
	age=newAge;
}
}
