
class Account {
	int accountNo;
	int accountBalance;
	int accountPassword;
	static String BankName = "RBI Bank";
	
	Account() {
		
	}
	
	Account(int accountNo, int accountBalance, int accountPassword) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	public void displayAccount() {
		System.out.println("-------------------------------------");
		System.out.println("Account No. : " +  getAccountNo());
		System.out.println("Account Balance : " + getAccountBalance());
		System.out.println("Account Password : " + getAccountPassword());
		System.out.println("Bank Name : " + BankName);
		System.out.println("-------------------------------------");
	}
	
}
public class QuestionFive {
	public static void main(String args[]) {
		Account ac = new Account(101,10000,123456);
		ac.displayAccount();
	}
}
