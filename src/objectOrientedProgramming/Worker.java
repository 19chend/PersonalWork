package objectOrientedProgramming;

public class Worker {
private int hours;
private double rate;
public Worker() {
}
public Worker(int hours, double rate) {
}
public int hours() {
	return hours;
}
public double rate() {
	return rate;
}
public double payCheck() {
	double check = -999.0;
	check = hours*rate;
	return check;
}
public void raise() {
	double raise = -999.0;
	raise = rate+2.0;
}
}

