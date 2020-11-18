package Oct6;

public class UserdefinedMethods {

	//String Methods
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello";
		String b="Hello";
		String c="hello";
		String d="World";
		String e ="    Welcome to Selenium Testing    ";
		//Compare methods
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(c));
		System.out.println(b.compareTo(c));
		System.out.println(c.compareTo(a));
		System.out.println(c.compareTo(b));
		//equals Methods
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		//Concatenate Methods
		System.out.println(a.concat(d));
		//Finding Index Postion
		System.out.println(a.charAt(2));

		//Length and Trim Functions
		System.out.println(e.length());
	    String f =e.trim();
		System.out.println(f.length());
		
		//Substring Methods
		System.out.println(f.substring(11));
		System.out.println(f.contains(e));//false
		System.out.println(e.contains(f));
		
	
	}
}
