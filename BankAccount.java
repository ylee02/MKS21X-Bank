public class BankAccount {
	private double balance = 0.0;
	private int accountID = 0;
	private String password = "";
	public BankAccount (double bal, int accID, String pass) {
		balance = bal;
		accountID = accID;
		password = pass;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setPassword(String newPass) {
		password = newPass;
	}
	public String toString() {
		return accountID + "\t" + balance;
	}
	public boolean deposit (double bal) {
		if (bal >= 0) {
			balance += bal;
			return true;
		}
		return false;
	}
	public boolean withdraw (double bal) {
		if (bal >= 0 && bal <= balance) {
			balance -= bal;
			return true;
		}
		return false;
	}
}