package h2bkoct12;

public class MethodOverriding1 extends MethodOveriding {

	
	public void Printname()
	{
		System.out.println("Anbu");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverriding1 obj1 = new MethodOverriding1();
		obj1.Printname();
	
		MethodOveriding obj2 = new MethodOveriding();
        obj2.Printname();
}
}
