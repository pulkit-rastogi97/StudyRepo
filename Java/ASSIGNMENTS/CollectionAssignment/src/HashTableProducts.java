import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class HashTableProducts {
	
	static Scanner scan = new Scanner(System.in);
	static String pId,pName;
	static Hashtable<String, Products> product = new Hashtable<String, Products>();
	static int choice=0;
	
	public static boolean insertIntoHashtable(Products p)
	{
		boolean flag = product.containsKey(p.getProId());
		product.put(p.getProId(), p);
		return flag;	
	}
	
	public static void search()
	{
		System.out.println("**********************************************");
		System.out.println("How you want to search the product ? ");
		System.out.println("1. Search by name ");
		System.out.println("2. Search by ID ");
		System.out.println("********************************************");

		choice = scan.nextInt();
		switch (choice) {
		case 1: System.out.println("Enter the name :: ");
			    pName = scan.next();
			    System.out.println(findByName(pName,product));
			    break;
		case 2: System.out.println("Enter the product Id :: ");
				pId = scan.next();
				System.out.println(findById(pId,product));
				break;
	   default: System.out.println("Invalid Choice ");

		}
	}
	
	public static void delete()
	{
		System.out.println("********************************************");
		System.out.println("How do you want to delete the product ? ");
		System.out.println("1. Delete By Name ");
		System.out.println("2. Delete By ID ");
		System.out.println("********************************************");

		choice = scan.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Enter the product name :: ");
				 pName = scan.next();
				 Products pname = deleteByName(pName, product);
				 if(pname==null)
				 {
					 System.out.println("Product Doesn't exist !!");
				 }
				 else
				 {
					 System.out.println("Product successfully deleted !! --> "+pname);
				 }
				 break;
		case 2 : System.out.println("Enter the product id :: ");
		         pId = scan.next();
		         Products pid = deleteById(pId, product);
		         if(pid==null)
				 {
					 System.out.println("Product Doesn't exist !!");
				 }
				 else
				 {
					 System.out.println("Product successfully deleted !! --> "+pid);
				 }
		         break;
	   default : System.out.println("Invalid Choice !! ");	
		}
	}
	
	public 	static String findByName(String str, Hashtable<String, Products> pro)
	{
		Products p = null;
		Set<String> key = pro.keySet();
		for(String id : key)
		{
			p = (Products) pro.get(id);
			if(p.getProdName().equals(str))
			{
				return "Product found :: "+p;
			}
		}
		return "Product Not Found !! ";
	}
	
	public static String findById(String str, Hashtable<String, Products> pro)
	{
		Set<String> key = pro.keySet();
		for(String id : key)
		{
			if(id.equals(str))
			{
				return "Product Found :: "+pro.get(id);
			}
		}
		
		return "Product Not Found !! ";
	}
	
	public static Products deleteById(String str,Hashtable<String,Products> pro)
	{
		Set<String> key = pro.keySet();
		Products p = null;
		for(String id : key)
		{
			if(id.equals(str))
			{
				return pro.remove(id);
			}
		}
		return p;
	}
	
	public static Products deleteByName(String str, Hashtable<String,Products> pro)
	{
		Set<String> key = pro.keySet();
		Products p = null;
		for(String id : key)
		{
			p = (Products) pro.get(id);
			if(p.getProdName().equals(str))
			{
				return pro.remove(id);
			}
		}
		return p;
	}
	
	
	public static void main(String[] args) {
		
		Products[] prod = new Products[10];		
		for (int i = 0; i < 10;i++) 
		{
			
			System.out.println("Enter the details of product no. " + (i + 1));
			System.out.println("Enter the Product ID :: ");
			pId = scan.next();
			System.out.println("Enter the Product Name :: ");
			pName = scan.next();
			prod[i] = new Products(pId, pName);
			if(insertIntoHashtable(prod[i]))
			{
				System.out.println("Product Already Exists !! ");
				prod[i]=null;
			}
			
		}
		System.out.println("*********************************");
		System.out.println("Which operation you would like to perform ? ");
		System.out.println("1. Search. ");
		System.out.println("2. Delete ");
		System.out.println("********************************************");

		//HashTableProducts pro = new HashTableProducts();
		choice = scan.nextInt();
		switch(choice)
		{
		case 1: search();
				break;
		case 2 : delete();
				break;
		default: System.out.println("Invalid Choice !!");
			    
		}
		
		

		scan.close();

	}
}
