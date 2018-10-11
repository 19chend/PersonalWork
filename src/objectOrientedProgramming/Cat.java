package objectOrientedProgramming;

public class Cat {
private int age;
private int sleep;
public Cat() {
}
public void birthday() {
	age = age++;
}
public int sleepMore() {
	sleep = sleep++;
	return sleep;
}
public int sleepLess() {
	sleep=sleep--;
	return sleep;
}

}
