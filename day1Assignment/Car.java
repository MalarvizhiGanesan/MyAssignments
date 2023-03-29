package week1.day1Assignment;

public class Car {
	public void driveCar() {
		// TODO Auto-generated method stub
		System.out.println("I am driving a Car");
	}
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("apply SuddenBrake");
	}
	public void soundHorn() {
	// TODO Auto-generated method stub
		System.out.println("Press soundHorn to Warn");
	}
	public void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("Tyre Puncture");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname objname=new classname();
		Car drive=new Car();
		//objectname.method()
				drive.driveCar();
				drive.applyBrake();
				drive.soundHorn();
				drive.isPuncture();
	}

}
