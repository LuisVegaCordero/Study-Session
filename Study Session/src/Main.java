
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Java");
		
		RegisterDisplay testing = new RegisterDisplay();
		testing.welcome();
		testing.userinterface();
		
		Register EmmanuelAccount = new Register(500);
		System.out.println("You have deposited: " +EmmanuelAccount.getBalance());
		EmmanuelAccount.deposit(2000);
		System.out.println("Your balance is: " +EmmanuelAccount.getBalance());
		
		
	}

}
