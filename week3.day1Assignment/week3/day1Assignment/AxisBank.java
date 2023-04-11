package week3.day1Assignment;

public class AxisBank extends BankInfo {

	public void deposit() {
		
		System.out.println("over-ride deposit ");
	}
	
	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		AB.saving();
		AB.fixed();
		AB.deposit();

}
}
