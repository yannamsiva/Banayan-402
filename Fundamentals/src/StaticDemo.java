
public class StaticDemo {

	static int sno=1000;
	static void display()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Directly : "+sno);
display();
System.out.println("Using ClassName  : "+StaticDemo.sno);
StaticDemo.display();

StaticDemo demo=new StaticDemo();

System.out.println("Referece varible  : "+demo.sno);
demo.display();

StaticDemo demo1=null;

System.out.println("Referece varible  : "+demo1.sno);
demo1.display();

		
		
		
	}

}
