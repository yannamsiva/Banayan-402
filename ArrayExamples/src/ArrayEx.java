
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]=new int[3];
		
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		
		System.out.println("===================================");
		
		for(int i : ar)
		{
			System.out.println(i);
		}
		System.out.println("===================================");

		for(int j=0;j<ar.length;++j)
		{
			System.out.println(ar[j]);
		}
			
		
		
		
	}

}
