package com.shiva;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter Student Number ");
int sno=sc.nextInt();
System.out.println("Enter Student Name ");
String sname=sc.next();

System.out.println("Enter Student Address ");
String sadd=sc.next();
System.out.println(sno+"\t"+sname+"\t"+sadd);
	}

}
