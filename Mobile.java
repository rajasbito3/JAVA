
public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oneplus a = new Oneplus();
		a.model();
		a.savecontact("RAJA", 1000);
		a.call("1234567890");
		a.game(1);
		a.Switch(1);
	}
}

class Oneplus {
	String name;
	String MobileNo;

	void model() {
		System.out.println("Model oneplus NORD");
		System.out.println("--------------------------");
	}

	void savecontact(String x, int y) {
		System.out.println("Contact saved successfully " +x+","+y);
		System.out.println("--------------------------");
	}

	public String call(String z) {
		if (z.length() < 10)
			System.out.println("Please enter 10 digit Mobile no");
		else
			System.out.println("Calling " +z);
		return z;
	}

	public int game(int option) {
		if (option == 1)
			System.out.println("Starting PUBG Battle Grounds");
		else
			System.out.println("Press 2 for Candycrush");
		return option;}
		void Switch(int a) {
		System.out.println("Phone is being turned off");
		}
	}
