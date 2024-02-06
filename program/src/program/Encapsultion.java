package program;

public class Encapsultion {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Sbi employee=new Sbi();
			System.out.println(employee.name);
			System.out.println(employee.ac);
			
			employee.setPin(1234, 12345);
			


		}

	}


	class Sbi{
		String name="chandan";
		int ac=1234567;
		int mobile=1234455665;
		 private int atmPin=1234;
		 private int ammount=100;
		 
		void getAmount(int pin) {
			if( pin==atmPin) {
				System.out.println(ammount);

			}else {
				System.out.println("in coreect pin");
			}
			
		}
		void setPin(int oldPin,int newPin) {
			if ( oldPin==atmPin) {
				System.out.println(" pin matched");
				atmPin=newPin;
				System.out.println("new pin has been set"+atmPin);
			}
			else
			{
				System.out.println("  pin doesnot match");
				
				
			}
		}
	}
		
			
	


