import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Jagged Array
		int ar[][]=new int[3][];
		
		ar[0]=new int[3];
		ar[1]=new int[2];
		ar[2]=new int[1];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;++i)
		{
			for(int j=0;j<ar[i].length;++j)
			{
				System.out.println("Enter The Number");
				ar[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Display Array Elements :");
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<ar[i].length;++j)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
