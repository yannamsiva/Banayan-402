
public class NestedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(int i=0;i<3;++i)//row {
		 * 
		 * for(int j=0;j<4;++j)//colum { System.out.print(j+" ");
		 * 
		 * } System.out.println();
		 * 
		 * 
		 * }
		 */
		
		

		/*
		 * for(int i=0;i<3;++i)//row {
		 * 
		 * for(int j=0;j<6;++j)//colum { System.out.print("*"+" ");
		 * 
		 * } System.out.println();
		 * 
		 * 
		 * }
		 */
		
		for(int i=0;i<4;++i)//row
		{
			
			
			for(int j=0;j<5;++j)//colum
			{
				if(i==0||j==0||i==3||j==4)
				System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
			
			
		}
		
		
		
		
		
	}

}
