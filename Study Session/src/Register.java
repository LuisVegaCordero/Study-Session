
public class Register {
	
		private double balance;
		private double inputedBalance;
		private double inputedWithdrawl;
		
		public Register(double userBalance) {
			
			balance = userBalance;
					
		}
		
		public Register() {
			
			balance = 0;
									
		}
		
		public void deposit(double depositedAmount) {
			
			balance += depositedAmount;
		}
		
		public double getBalance() {
			return balance;
		}
		
		
		
}
