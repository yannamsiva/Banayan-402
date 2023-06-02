
public class SwapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno=100;int sno=200;

		System.out.println("Before Swapping ");
		System.out.println("Fno : "+fno+"\t"+"Sno  :"+sno);
		//swapping(interchange)

		fno=fno+sno;
		sno=fno-sno;
		fno=fno-sno;
		
		

		System.out.println("After Swapping ");
		System.out.println("Fno : "+fno+"\t"+"Sno  :"+sno);



			}

		}
