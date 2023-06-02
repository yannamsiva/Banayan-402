import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter The Age");
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if(age>18)
{
	System.out.println("Enter The Weight");
	
	int weight=sc.nextInt();
	if(weight>40)
		System.out.println("He/She Ready To give the Blood");
	else
		System.out.println("He/She UnderWeight");
	
	
	
	
}
else
	System.out.println("He/She Minor");
	}

}
