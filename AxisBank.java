package week3.day1.assignment;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank access = new AxisBank();		
		access.saving();
		access.fixed();
		access.deposit();
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		System.out.println("This method is overriding in AxisBank class, originally defined in Bank Info Class ");
	}
}
