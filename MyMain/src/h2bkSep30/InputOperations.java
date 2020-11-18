package h2bkSep30;

import java.util.Scanner;


public class InputOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassNameSource obj =new Classname
		
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

}


