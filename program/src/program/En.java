package program;


public class En {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sbii employee=new Sbii();
		System.out.println(employee.name);
		System.out.println(employee.ac);
		
		employee.setPin(1234, 123456);
		employee.getAmount(12345);


	}

}


class Sbii{
	String name="chandan";
	int ac=1234567;
	int mobile=1234455665;
	 private int atmPin=1234;
	 private int ammount=1008;
	 
	void getAmount(int pin) {
		if( pin==atmPin) {
			System.out.println(ammount);

		}else {
			System.out.println("in coreect pin");
		}
		
	}
	void setPin(int oldPin,int newPin) {
		atmPin=newPin;
		System.out.println("new pin has been set"+atmPin);
	}
}
