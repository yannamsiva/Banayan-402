import java.util.Scanner;

public class Calculation {

	int add(int fno,int sno)
	{
		return fno+sno;
	}
	
	int sub(int fno,int sno)
	{
		return fno-sno;
	}
	int mul(int fno,int sno)
	{
		return fno*sno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation cal=new Calculation();
		while(true)
		{
System.out.println("================================================");
System.out.println("                   1)ADD                        ");
System.out.println("                   2)SUB                        ");
System.out.println("                   3)MUL                        ");
System.out.println("                   4)EXIT                        ");
System.out.println("================================================");

Scanner sc=new Scanner(System.in);

System.out.println("Enter The Choice");
int choice=sc.nextInt();
switch(choice)
{

case 1: 
	int add=cal.add(100, 200);
	System.out.println("Additon of two numbers : "+add);
	break;
	
case 2: 
	int sub=cal.sub(1000, 200);
	System.out.println("Subtraction of two numbers : "+sub);
	break;
	
case 3: 
	int mul=cal.add(100, 200);
	System.out.println("Subtraction of two numbers : "+mul);
	break;
	
case 4:
	System.out.println("Thx for Using Application");
	System.exit(0);
default:
	System.out.println("Choose 1 to 4 Between");
	

}





		}//end of while
	}

}
