class Kite
{
	private String Kitecolor;
	private String Kiteowner;
	private int length;
	
	private static int kitecount; // class's data - its never as object's data

	public Kite(String kitecolor, String kiteowner, int length) {
		super();
		Kitecolor = kitecolor;
		Kiteowner = kiteowner;
		this.length = length;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
		
}


public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
