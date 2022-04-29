class bank
{
	public static void main(String args[])
	{
	Home myhome = new Home();
	myhome.doregister();
	}
}
class Home
{
	void doregister() 
	{
	System.out.println("doregister() is invoked..");
	dologin();	
	}
	void dologin() 
	{
	System.out.println("dologin() is invoked..");
	logout a = new logout();
	a.dologout();
	}
}
class logout
{
	void dologout()
	{
	System.out.println("You have successfully logged out");
	}
}

 