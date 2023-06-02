
public class Product {
	int pid;
	String pname;
	
	public void displayInfo()
	{
		pid=1000;
		pname="TV";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pro=new Product();
System.out.println(pro.pid+"\t"+pro.pname);//0 null
pro.displayInfo();
System.out.println(pro.pid+"\t"+pro.pname);//1000 tv

	}

}
