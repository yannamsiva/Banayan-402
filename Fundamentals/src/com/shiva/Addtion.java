package com.shiva;

public class Addtion {

	public int add(int fno,int sno)
	{
		return fno+sno;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new Addtion().add(500,200));

Addtion add = new Addtion();
int count = add.add(250,6);
System.out.println(add);
	}

}
