package objectOrientedProgramming;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat bob = new Cat();
bob.setAge(7);
System.out.println("Age: "+bob.getAge());
System.out.println("Age after birthday: "+bob.getBirthday());

bob.setSleep(8);
System.out.println("Hours of sleep: "+bob.getSleep());
bob.setSleepMore(8);
System.out.println("Sleeping more: "+bob.getSleep()+" hours");
bob.setSleepLess(8);
System.out.println("Sleeping less:" +bob.getSleep());




	}

}
