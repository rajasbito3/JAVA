
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.dial();
		byte speedNumber=123;
		p.dial(speedNumber);
		p.dial("Raja");
		p.dial("Raja","Batman");
		p.dial(speedNumber, "Raja");
	}
}
class Phone
{
	void dial() {
		System.out.println("Dialing nowhere....");
	}
void dial(byte speedDial) {
	System.out.println("Dialing"+speedDial);
}
void dial(String name) {
	System.out.println("Dialing"+name);
}
void dial( String name1, String name2) {
	System.out.println("Con call with "+name1+"  "+name2);
}
void dial(byte no, String name3) {
	System.out.println("calling "+no+" " +name3);
}
}