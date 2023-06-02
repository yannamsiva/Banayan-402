
public class Employee {

	//non-static varible/instance varibles
	int eno;
	String ename;
	String eadd;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.eadd);
		
		emp.eno=1000;
		emp.ename="rani";
		emp.eadd="hyd";
		System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.eadd);
	}

}
