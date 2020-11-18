package h2bkOct8;

public class Student {
	String FName="Anbarasi";
	String LName="Annamalai";
	static String CollegeName="Madras University chennai";

	
	public void Studentdetails()
	{
		System.out.println(FName);
		System.out.println(LName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student();
		Student std2 = new Student();
		std1.Studentdetails();
		std2.Studentdetails();
		//std1.CollegeName ="Madras University";
		System.out.println(std1.CollegeName);
		//CollegeName is defined as Static so both St1 and St2 uses the same value
		System.out.println(std2.CollegeName);
	}
	}


