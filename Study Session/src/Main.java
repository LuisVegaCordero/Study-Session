import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Java");
		System.out.println("Why is this so fucking annoying!");
		
		RegisterDisplay testing = new RegisterDisplay();
		Scanner userinput = new Scanner(System.in);
		
		testing.welcome();
		testing.accountSelection();
		
		int inputed = userinput.nextInt();
		
		
		Register EmmanuelAccount = new Register(500);
		System.out.println("You have deposited: " +EmmanuelAccount.getBalance());
		EmmanuelAccount.deposit(2000);
		System.out.println("Your balance is: " +EmmanuelAccount.getBalance());
		
		//test de git #1
		//test de git #2
	}

}
