
class marvel{
	
	void print()
	{
		System.out.println("Marvel Comics");
	}
}

class superheroes extends marvel

{
	
	void print()
	{
		System.out.println("Avengers are Superheroes");
	}
}


class hulk extends superheroes{
	void print()
	{
		System.out.println("Hulk is the strongest Avenger");
	}
	
	
}


public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marvel m=new marvel();
		m.print();
		m=new superheroes();
		m.print();
		m=new hulk();
		m.print();

	}

}