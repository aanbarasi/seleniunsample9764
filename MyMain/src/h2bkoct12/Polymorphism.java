package h2bkoct12;

public class Polymorphism {

	//Polymorphism means using a method in many forms, Method overloading concept, either the parameter could be different
	//or Return type could different
	
	public void add(int a, int b)
	{
		
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b)
	{
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism poly = new Polymorphism();
		poly.add(2,4);
		poly.add(10, 10, 10);
		poly.add(20.5, 10.5);
	}

}
	