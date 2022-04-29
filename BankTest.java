import java.awt.Frame;
import java.time.LocalDate;

public class BankTest {
	public static void main(String[] args) {
		BankAccount baAccObj1 = new BankAccount(101, "Jack", 50000, "9962052904");

		System.out.println("-------------");

		SavingsAccount savAccObj2 = new SavingsAccount(102, "Jane", 90000, 3.5,"9962052904");

		System.out.println("-------------");

		FixedDepositAccount fdAccObj3 = new FixedDepositAccount(101, "Julie", 90000, 7.5, 5,"9962052904");

		//CurrentAccount fdAccObj4 = new CurrentAccount(105, "Reliance Industries", 10000, 6, 12000,"9962052904"),;

		// double MAB = fdAccObj4.calculateMAB();

		baAccObj1.printBankAccount();
		System.out.println("-------------");
		savAccObj2.printBankAccount();
		double si = savAccObj2.calculateSimpleInterest();
		System.out.println("simple interest : " + si);

		System.out.println("-------------");
		fdAccObj3.printBankAccount();
		double ma = fdAccObj3.calculateMaturityAmount();
		System.out.println("maturity amount : " + ma);

		System.out.println("-------------");
		//fdAccObj4.printBankAccount();
	}
}

//making the data member as private
// and allowing this data via accessible functions

class BankAccount {
	// DATA MEMBER
	private int accountNumber; // FIELD
	private String accountHolderName; // FIELD
	protected double accountBalance; // FIELD
	//private LocalDate accountOpeningDate;
	String mobileNumber;

	BankAccount(int x, String y, double z,String m) {
		//System.out.println("BankAccount(int,String,double)...constructor invoked....");

		if (x < 0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		} else
			accountNumber = x;

		if (y == null) {
			throw new RuntimeException("Account holder name cannot be null...terminating..");
		} else
			accountHolderName = y;

		if (z < 0) {
			// RuntimeException r = new RuntimeException("some problem.....");
			// throw r;
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		} else
			accountBalance = z;
			mobileNumber =m;
			}

	void setMobileNumber(String m)
	{
		//System.out.println("The New mobile Number is -----"+m);
		mobileNumber =m;
	}
	void changeName(String name)
	{
	System.out.println("The Modified Name of the Customer is "+name);
	accountHolderName=name;
	}
	// accessor
	void printBankAccount() {
		System.out.println("Account Number  : " + accountNumber);
		System.out.println("Account HName   : " + accountHolderName);
		System.out.println("Account Balance : " + accountBalance);
		System.out.println("Mobile number	: " + mobileNumber);
		System.out.println("-----------------------");
	}

	double withdraw(double amountToWithdraw) {
		if (amountToWithdraw > accountBalance) {
			throw new RuntimeException("Insufficient funds....");
		}
		System.out.println("Withdraw in progresss..." + amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw is done...");
		return accountBalance;
	}

	double deposit(double amountToDeposit) {
		if (amountToDeposit > 50000) {
			throw new RuntimeException("Please provide the PAN OR Form60");
		}
		System.out.println("Deposit in progresss..." + amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("Deposit is done...");
		return accountBalance;
	}

	double getBalance() { // accessor
		return accountBalance;
	}
}

class SavingsAccount extends BankAccount {
	// DATA MEMBER
	protected double rateOfInterest;

	SavingsAccount(int x, String y, double z, double r, String m) {
		super(x, y, z,m); // invoke the ctor of the super class
		System.out.println("SavingsAccount(int,String,double,double)...constructor invoked....");

		if (r < 0) {
			throw new RuntimeException("Account rate cannot be in negative...terminating..");
		} else
			rateOfInterest = r;
	}

	// accessor
	void printBankAccount() {
		super.printBankAccount();
		System.out.println("Account ROI     : " + rateOfInterest);
		System.out.println("-----------------------");
	}

	double calculateSimpleInterest() {
		return (super.accountBalance * 1 * rateOfInterest) / 100;
	}
}

class FixedDepositAccount extends SavingsAccount {
	// DATA MEMBER
	private int tenure;

	FixedDepositAccount(int x, String y, double z, double r, int t, String m) {
		super(x, y, z, r,m); // invoke the ctor of the super class
		System.out.println("FixedDepositAccount(int,String,double,double,int)...constructor invoked....");

		if (t < 0) {
			throw new RuntimeException("Fixed Deposit Account tenure cannot be in negative...terminating..");
		} else
			tenure = t;
	}

	// accessor
	void printBankAccount() {
		super.printBankAccount();
		System.out.println("Fixed Tenure    : " + tenure);
		System.out.println("-----------------------");
	}

	double calculateMaturityAmount() {
		double x = Math.pow((1 + rateOfInterest / 100), tenure);
		double y = accountBalance * x;
		return y;
	}
}

class CurrentAccount extends BankAccount {
	// DATA MEMBER
	private int tenure;

	CurrentAccount(int a, String b, double c, double r, int t, String m) {
		super(a, b, c,m);
		System.out.println("CurrentAccount(int,String,double,double,int)...constructor invoked....");

		if (t < 10000) {
			throw new RuntimeException("Current Account Balance is less than 10,000... Please maintain sufficient account balance to avoid MAB Charges");
			} else
			tenure = t;
	}

	// accessor
	void printBankAccount() {
		super.printBankAccount();
		System.out.println(" Minimum Average Balance in Current Account    : " + tenure);
		System.out.println("-------------------------------------------------------");
	}
}
/*
 * double calculateMAB() { double z; double t; double x =(z/t) ; return x; } }
 */
