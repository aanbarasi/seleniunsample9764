	package h2bkOct7;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring Array
		int a[]= new int[] {10,20,30,40,50,60,70,80,90, 100};
		String b[]= new String[] {"hello","welcome","to","class"};
		String c[] = new String[] {"a","b","c","d","e","f"};
		//Initializing Array
		//a[0]= 10;
		//a[1]= 20;
		//a[2]= 30;
		//a[9]= 100;
		for (int i = 0;i <=9;i++) 
			{
				System.out.println(a[i]);
			}
			
		//Find the size of the array
		for(int j =0; j<b.length; j++)
		{
	
			System.out.println(b[j]);
			System.out.println(j);
		}
	
	//for each loop for(data_type variable : array | collection){  //body of for-each loop }
	  
	/*for(String k:c)
	{
		System.out.println(k);
	}
	*/

	
	}
}


