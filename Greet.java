class Regards
{
	public static void main(String args[])
	{
	System.out.println("Regards to the world of java");					
	Joker jk = new Joker();
	Joker1 jk1 = new Joker1();
	Joker2 jk2 = new Joker2();
	jk.jump();
	jk1.dance();
	jk2.mind();
	}
}
class WarmRegards
{
	public static void main(String args[])
	{
	System.out.println("Warm Regards to the world of java");					
	}
}
class Joker
{
	public void jump()
	{
	System.out.println("Joker kills Batman"+this);	
	}
}
class Joker1
{
	public void dance()
	{
	System.out.println("Joker kills Riddler"+this);	
	}
}
class Joker2
{
	public void mind()
	{
	System.out.println("Joker's jokes were bad"+this);	
	}
}