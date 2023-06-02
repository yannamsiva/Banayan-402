import java.util.Scanner;

public class TernnaryOpertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter The Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String msg=(num%2==0)?"Given Number is Even":"Given Number is Odd Number";
		
		System.out.println(msg);
		
	}

}
