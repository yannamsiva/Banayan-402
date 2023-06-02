package com.shiva;

public class Student {

	int sno;
	String sname;
	String sadd;
	public void displayDetails(int sno,String sname,String sadd)
	{
		this.sno=sno;
		this.sname=sname;
		this.sadd=sadd;
		
		System.out.println(sno+"\t"+sname+"\t"+sadd);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st=new Student();
System.out.println(st.sno+"\t"+st.sname+"\t"+st.sadd);
st.displayDetails(100, "shiva","Hyd");
System.out.println(st.sno+"\t"+st.sname+"\t"+st.sadd);

	}

}
