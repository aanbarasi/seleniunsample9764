package h2bk0ct9;

public class ChildClass extends ParentClass{

	public void helllo ()
	{
		System.out.println("Hello I am the Child Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass childobj = new ChildClass();
		//Summary function is inherited from Parent class
		ParentClass.Summary();
		childobj.helllo();
		//parentval inhertied from Parent class
		System.out.println(childobj.parentval);
	}

}
