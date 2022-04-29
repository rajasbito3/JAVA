public class AssociationTest {

	public static void main(String[] args) {
		BankAccount x = new BankAccount(101,"Jack",50000,"9820443464");
		x.printBankAccount();
		System.out.println("----");
		BankAdmin1 admin = new BankAdmin1();
		admin.changeMobileNumberOfAccountHolder(x, "9920445566");
		//admin.changeName(101,"RAJA");
		System.out.println("======");
		x.printBankAccount();
		admin.changeName1(x,"RAJA");
		x.printBankAccount();
	}
}
class BankAdmin1
{
	void changeMobileNumberOfAccountHolder(BankAccount y, String z) { // y=x;
		y.setMobileNumber(z);
	}
	void changeName1(BankAccount y, String a) {
	y.changeName(a);
}
} 