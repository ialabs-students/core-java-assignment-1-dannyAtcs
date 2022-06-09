package com.assignment1;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
	
	private List<Product> arr;
	ProductRepository() {
		
		arr = new ArrayList<Product>();
		
		arr.add(new Product(101,"Polo-Tshirt",250,"Tshirt"));
		arr.add(new Product(102,"PartyWear-Tshirt",250,"Tshirt"));
		arr.add(new Product(103,"RoundNeck-Tshirt",250,"Tshirt"));
		
		
		arr.add(new Product(104,"Lenovo",40000,"laptop"));
		arr.add(new Product(105,"HP",45000,"laptop"));
		arr.add(new Product(106,"ASUS",55000,"laptop"));
		
		arr.add(new Product(107, "Volvo" , 1500000, "Car"));
		arr.add(new Product(107, "Kia" , 1200000, "Car"));
		arr.add(new Product(107, "MGHector" , 1800000, "Car"));
		
	}
		
	public List<Product> getlist()
	{
		return arr;
	}
      
  		


}
