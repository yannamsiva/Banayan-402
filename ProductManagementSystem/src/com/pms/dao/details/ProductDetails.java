package com.pms.dao.details;

import java.util.List;
import java.util.Scanner;

import com.pms.client.ProductClient;
import com.pms.dao.ProductDAO;
import com.pms.dao.impl.ProductDAOImpl;
import com.pms.model.Product;

public class ProductDetails {

	Scanner sc=new Scanner(System.in);
	
	ProductDAO daoImpl=new ProductDAOImpl();
	public void menuDetails() {

		
		while(true)
		{
		System.out.println("-------------------------------------------------------");

		System.out.println("                  1)AddProduct                         ");
		System.out.println("                  2)ViewAllProducts                         ");
		System.out.println("                  3)viewProduct                         ");
		System.out.println("                  4)DeleteProduct                         ");
		System.out.println("                  5)Back                         ");

		System.out.println("-------------------------------------------------------");
		
		System.out.println("Enter The Choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			daoImpl.saveProduct();
			break;
		case 2:
			List<Product> viewAllProducts = daoImpl.viewAllProducts();
			
		System.out.println("------------------------------------------------------------------");
		System.out.println("PID \t PNAME \t  QTY  \tPRICE");
		
		System.out.println("------------------------------------------------------------------");
			
			viewAllProducts.stream().forEach(
					pro
					->
					System.out.println(pro.getPid()+"\t"+pro.getPname()+"\t"+pro.getPrice()+"\t"+pro.getQty())
					
					);
			
			break;
		case 3:
		
		System.out.println("Enter Product Id");
		Product p = daoImpl.viewProduct(sc.nextInt());
		
		if(p!=null)
			System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
		else
			System.out.println("Given Record is not Exist");
		break;
		case 4:
			System.out.println("Enter Product Id");
			daoImpl.deleteProduct(sc.nextInt());
			break;
		case 5:
			
			ProductClient.main(null);
			break;
			default:
				System.out.println("Choose 1 to 5 Between");
				
		
		
		
		
		
		}//end of switch
		
		
		}//end of while

	}// end of menu
}
