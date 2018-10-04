public class driver {
	 
	public static void main(String[] args) {
		BankAccount a = new BankAccount(12222.0, 132131, "hello");
		if( a.withdraw(1000) ){
			System.out.println("Withdrawal success!");
		}
		else {
			System.out.println("Withdrawal failure");
		}
		if( a.deposit(1000) ){
			System.out.println("Withdrawal success!");
		}
		else {
			System.out.println("Withdrawal failure");
		}
		System.out.println(a);
		System.out.println(a.getBalance());
		System.out.println(a.getAccountID());
	}
}