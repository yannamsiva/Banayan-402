package com.pms.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {

	List<Product> addProducts = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void saveProduct() {
		// TODO Auto-generated method stub

		int k = 1;
		while (k == 1) {
			System.out.println("Enter Product Id");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name");
			String pname = sc.next();
			System.out.println("Enter Product Qty");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price");
			int price = sc.nextInt();
			Product pro = new Product(pid, pname, qty, price);

			addProducts.add(pro);

			System.out.println("Product Added SuccessFully");

			System.out.println("Do You Want to Add More Records 1)Yes 2)No");
			k = sc.nextInt();

		}
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return addProducts;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub

		for (Product pro : addProducts) {
			if (pro.getPid() == pid) {
				return pro;

			}

		}

		return null;
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub

		int k = 0;

		for (Product pro : addProducts) {
			if (pro.getPid() == pid) {
				addProducts.remove(pro);
				System.out.println("Record Deleted SuccessFully");
				++k;
				break;
			}

		}

		if (k == 0)
			System.out.println("Given Record is Not Exist");

	}

}
