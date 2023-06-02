import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter A Number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%2==0)
	System.out.println("Given Number is Even Number");
else
	System.out.println("Given Number is Odd Number");

	}

}
