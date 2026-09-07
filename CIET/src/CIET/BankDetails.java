/*

package CIET;
class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;
	BankAccount(String accountHolder, int accountNumber,double balance) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid Withdrawal Amount");
		}
		else if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+" withdraw Successful");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	void displayBalance() {
		System.out.println("---- Account Holder Details ----");
		System.out.println(accountHolder);
		System.out.println(accountNumber);
		System.out.println(balance);
	}
}
public class BankDetails {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount("Anu",253568756,50000);
		ba.displayBalance();
		ba.deposit(5000);
		ba.displayBalance();
		ba.withdraw(1500);
		ba.displayBalance();
		ba.withdraw(60000);
	}
}



//o/p:-
//---- Account Holder Details ----
//Anu
//253568756
//50000.0
//5000.0
//---- Account Holder Details ----
//Anu
//253568756
//55000.0
//1500.0 withdraw Successful
//---- Account Holder Details ----
//Anu
//253568756
//53500.0
//Insufficient Balance
//


*/