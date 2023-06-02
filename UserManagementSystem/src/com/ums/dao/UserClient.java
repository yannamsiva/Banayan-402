package com.ums.dao;

import java.util.Scanner;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserDAOImpl daoImpl=new UserDAOImpl();
while(true)
{
		System.out.println("===========================================");
		System.out.println("             1)Register                    ");
		System.out.println("             2)Login                    ");
		System.out.println("             3)Exit                    ");
		
		
		
		
		System.out.println("===========================================");

		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			
			daoImpl.register();
			
			break;
			
		case 2:
			
			boolean verifyValidUserNamePassWrod = daoImpl.verifyValidUserNamePassWrod("admin", "admin123");
		if(verifyValidUserNamePassWrod)
		{
			System.out.println("Valid User");
		}
		else
			System.out.println("In Valid User");
		
		break;
		
		case 3:
			System.out.println("Thx for Useing App!");
			System.exit(0);
		
		default:
			System.out.println("Choose 1 to 3 Between");
		
		}
		
		
		
		
}	}

}
