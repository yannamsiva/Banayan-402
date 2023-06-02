import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]=new int[3];

System.out.println("Read The data from console store inside the Array");
Scanner sc=new Scanner(System.in);
for(int i=0;i<ar.length;++i)
{
	System.out.println("Enter The Number");
	ar[i]=sc.nextInt();
}

System.out.println("============================");

for(int j : ar)
{
	if(j%2==0)
	System.out.println("Even Number : "+j);
	else
		System.out.println("Odd Number : "+j);
}



	}

}
