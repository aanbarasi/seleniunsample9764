package h2bkSep30;

import java.util.Scanner;

//import com.sun.jdi.Method;




public class Methods {
	//Method without Return Type
	public void  Vote()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name =obj.next();
		System.out.println("Enter your age:");
		//int age = obj.nextInt();
		try {
			int age =obj.nextInt();
			if (age >=18)
				
			{
				System.out.println("Eligible to Vote " +name);
					
			}
				
			else 
			{
			System.out.println("Not eligible to Vote "+name);
			}	
		
		}catch (Exception e) {
		
			// TODO: handle exception
			System.out.println("Enter an integer value for age:");
			e.printStackTrace();
		}
		
		
	}
	//Method without Return Type
	public void myname()
	{
		System.out.println("My name Anbu");
	}
	//Method with Return Type integer
	public int add()
	{
		int sum =10+6;
		return sum;
				
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Methods voter = new Methods();
		voter.Vote();
		voter.myname();
		int s= voter.add();
		System.out.println(+s);
		System.out.println(voter.add());
	}

}

