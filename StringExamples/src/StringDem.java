import java.util.Scanner;

public class StringDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter The Name");
Scanner sc=new Scanner(System.in);

String uname=sc.next();

System.out.println("Enter The PassWord");
String pass=sc.next();

if(uname.equals("Admin")&&pass.equals("Admin@123"))
{
	System.out.println("Valid User");
}
else
{
	System.out.println("InValid User");
	
		
}
		
		
	}

}
