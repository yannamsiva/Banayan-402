import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		
		int marks=sc.nextInt();
		String grade="";
		if(marks<=100&&marks>=90)
              grade="A Grade";
		else if(marks<90&&marks>=80)
			grade="B Grade";
		else if(marks<80&&marks>=70)
			grade="C Grade";
		else if(marks<70&&marks>=60)
			grade="D Grade";
		else if(marks<60&&marks>=50)
			grade="C Grade";
		else if(marks<50&&marks>=40)
			grade="D Grade";
		else
			System.out.println("Try For Sep !");
		
		
		System.out.println(grade);
		
	}

}
