package com.assignment1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {

	ProductRepository ob = new ProductRepository();
	List<Product> pro = ob.getlist();
	
	
	public String findNameByCode(int id)
	{
		for(Product x : pro )
		{
			if(x.getProductCode()==id)
			{
				//System.out.println("Product name is : " + x.getName() );
				return x.getName();
			}
		}
		return null;
		
	}
	
	public Product findMaxPriceProduct(String category)
	{
		List<Product> subPro = new ArrayList<Product>();
		for(Product x: pro)
		{
			if(x.getCategory()==category)
			{
				subPro.add(x);
			}
		}
		if(subPro.isEmpty())
		{
			return null;
		}
		Product max = subPro.stream().max(Comparator.comparingDouble(Product::getPrice)).get();
		return max;
		
	}
	
	public List<Product> getProductsByCategory(String category)
	{
		List<Product> subPro1 = new ArrayList<Product>();
		for(Product x: pro)
		{
			if(x.getCategory()==category)
			{
				subPro1.add(x);
			}
		}
		if(subPro1.isEmpty())
		{
			return null;
		}
		return subPro1;
		
	}
	
	public static void main(String[] args) {
		
	
		ProductService pro = new ProductService();
		System.out.println(pro.findNameByCode(101));
		System.out.println(pro.findNameByCode(108));
		System.out.println(pro.findNameByCode(104));
		System.out.println(pro.findMaxPriceProduct("laptop"));
		System.out.println(pro.findMaxPriceProduct("Car"));
		System.out.println(pro.getProductsByCategory("Tshirt"));
		System.out.println(pro.getProductsByCategory("Bike"));
		
	}
}
