package com.psl.pl;
import com.psl.bean.*;
import com.psl.dao.*;
import java.util.*;
public class JDBCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Employee> employees =null;
			employees=JDBCcode.fetch();
			
			System.out.println(employees);
			
			Scanner sc = new Scanner(System.in);
			int choice=sc.nextInt();
			System.out.println("1.Sort by Id\n2.Sort by Name\n3.Sort by Salary");
			switch(choice) {
			
			case 1:
				Collections.sort(employees, new IdSorter());
				System.out.println(employees);
				break;
			case 2:

				Collections.sort(employees, new NameSorter());
				System.out.println(employees);
				break;
			case 3:

				Collections.sort(employees, new SalarySorter());
				System.out.println(employees);
				break;
			default: System.out.println("Please enter a valid choice ! ");
			
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
