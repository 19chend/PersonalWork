package objectOrientedProgramming;

public class Cat {
private int age;
private int sleep;
public Cat() {
	age = -999;
	sleep = -999;
}
public int getAge(){
	return age;
}
public int getSleep() {
	return sleep;
}
public int getBirthday() {
	return age+1;
}
public void setAge(int newAge){
	age = newAge;
}
public void setSleepMore(int sleepMore){
	sleep = sleep+1;
}
public void setSleepLess(int sleepLess){
	sleep = sleep-1;
}
}
