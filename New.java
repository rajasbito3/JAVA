public class New {

	public static void main(String[] args) {
		byte b = 15;
		int c = 15;
		short d = 15;
		long e = 15;
		float f = 15;
		double g = 15;
		char h = 'a';
		System.out.println("b is " + b);
		System.out.println("byte size :" + Byte.SIZE + "bits");
		System.out.println("min value : " + Byte.MIN_VALUE);
		System.out.println("max value : " + Byte.MAX_VALUE);
		System.out.println("c is " + c);
		System.out.println("min value : " + Integer.MIN_VALUE);
		System.out.println("max value : " + Integer.MAX_VALUE);
		System.out.println("d is " + d);
		System.out.println("min value : " + Short.MIN_VALUE);
		System.out.println("max value : " + Short.MAX_VALUE);
		System.out.println("e is " + e);
		System.out.println("min value : " + Long.MIN_VALUE);
		System.out.println("max value : " + Long.MAX_VALUE);
		System.out.println("f is " + f);
		System.out.println("min value : " + Float.MIN_VALUE);
		System.out.println("max value : " + Float.MAX_VALUE);
		System.out.println("g is " + g);
		System.out.println("min value : " + Double.MIN_VALUE);
		System.out.println("max value : " + Double.MAX_VALUE);
		System.out.println("h is " + h);
		System.out.println("min value : " + Character.MIN_VALUE);
		System.out.println("max value : " + Character.MAX_VALUE);
		for (int index=0; index<255; index++)
		{
		System.out.println(index+"The Character is :" +(char)index);
		}
	}
}
