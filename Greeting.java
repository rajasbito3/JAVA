class Greeting {
	public static void main(String args[]) {
		System.out.println("Welcome to makemyTrip");
		Home h = new Home();
		h.doRegister();
	}
}

class Home {
	void doRegister() {
		System.out.println("doRegister() is invoked...");
		Register reg = new Register();
		reg.registration();
		doLogin();
	}

	void doLogin() {
		System.out.println("doLogin() is invoked...");
		Login log = new Login();
		log.authenticate();
	}

}

class Login {
	void authenticate() {
		System.out.println("authenticate() is invoked...");
		DashBoard db = new DashBoard();
		db.presentDashBoard();
	}
}

class Register {
	void registration() {
		System.out.println("registration() is invoked...");
	}
}

class DashBoard {
	void presentDashBoard() {
		System.out.println("DashBoard is presented....");

		ViewBalance vb = new ViewBalance();
		vb.printBalance();

		book ap = new book();
		ap.flight();
		ap.hotel();
		ap.Trip();
		ap.payment();
		ap.coupon();

		flight t = new flight();
		t.doair();
		t.doindigo();
		t.doTrip();

		airlines st = new airlines();
		st.bookedairlines();
		st.upcomingairlines();
		st.feedback();
		Logout lg = new Logout();
		lg.doingLogout();
	}
}

class Logout {
	void doingLogout() {
		System.out.println("doing logout..");
	}
}

class ViewBalance {
	void printBalance() {
		System.out.println("Your MakemyTrip Wallet balance is Rs.1000/-");
	}
}

class book {
	void flight() {
		System.out.println("Click here to book flight tickets");
	}

	void hotel() {
		System.out.println("Click here to book hotel");
	}

	void Trip() {
		System.out.println("click here to join preplanned Trips pan india");
	}

	void payment() {
		System.out.println("Select Payment type - Creditcard/INB/Wallet");
	}

	void coupon() {
		System.out.println("Select Coupons - if applicable");
	}
}

class flight {
	void doair() {
		System.out.println("Filter only AirIndia Flights");
	}

	void doindigo() {
		System.out.println("Filter only Indigo Flights");
	}

	void doTrip() {
		System.out.println("Filter only Spicejet Flights");
	}
}

class airlines {
	void bookedairlines() {
		System.out.println("View Booked flights");
	}

	void upcomingairlines() {
		System.out.println("View Upcoming flights");
	}

	void feedback() {
		System.out.println("Submit rating/feedback of previous flight experiences");
	}
}