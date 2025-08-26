package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {// map- no need to tell how many data we are gonna store
		
		
		
		//Student1
		Map<String,String> StudentDetails1 = new HashMap<>();
		StudentDetails1.put("Name","John Doe");
		StudentDetails1.put("Age","Twenty");
		StudentDetails1.put("Gender","Male");		
		StudentDetails1.put("Roll Number","SBA12345");		
		StudentDetails1.put("Grade","A++");		
		StudentDetails1.put("Major","Computer Science");
		StudentDetails1.put("GPA","A3.8");
		StudentDetails1.put("Email","john@example.com");
		StudentDetails1.put("PAN Number","SDF6543210");
		StudentDetails1.put("Address","123 Elm St");
		
		//Student2
		Map<String,String> StudentDetails2 = new HashMap<>();
		StudentDetails2.put("Name","Jane Smith");
		StudentDetails2.put("Age","21");
		StudentDetails2.put("Gender","Female");		
		StudentDetails2.put("Roll Number","S12346");		
		StudentDetails2.put("Grade","B+");	
		StudentDetails2.put("Major","Mathematics");
		StudentDetails2.put("GPA","A3.5");
		StudentDetails2.put("Email","jane@example.com");
		StudentDetails2.put("PAN Number","REW6543211");
		StudentDetails2.put("Address","456 Oak St");
		
		
		//Student3
		Map<String,String> StudentDetails3 = new HashMap<>();
		StudentDetails3.put("Name","Mike Brown");
		StudentDetails3.put("Age","Twenty Two");
		StudentDetails3.put("Gender","Male");		
		StudentDetails3.put("Roll Number","SBA12347");		
		StudentDetails3.put("Grade","A+");		
		StudentDetails3.put("Major","Physics");
		StudentDetails3.put("GPA","A3.9");
		StudentDetails3.put("Email","mike@example.com");
		StudentDetails3.put("PAN Number","TYR6543212");
		StudentDetails3.put("Address","789 Pine St");
		
		
				//Employee1Map
				Map<String,String > Employee1Map = new HashMap<String,String>();
				Employee1Map.put("Employee ID","E001");
				Employee1Map.put("Name","Alice Green");
				Employee1Map.put("Age","Thirty");
				Employee1Map.put("Gender","Female");
				Employee1Map.put("Department","Engineering");
				Employee1Map.put("Position","Software Engineer");
				Employee1Map.put("Salary","75k Pounds");
				Employee1Map.put("Email","alice@example.com");
				Employee1Map.put("PAN","SDF6543210");
				//System.out.println("Employee 1 details :"+Employee1Map);
				
				
				//Employee2Map
				Map<String,String > Employee2Map = new HashMap<String,String>();
				Employee2Map.put("Employee ID","E002");
				Employee2Map.put("Name","Bob Johnson");
				Employee2Map.put("Age","35");
				Employee2Map.put("Gender","Male");
				Employee2Map.put("Department","Marketing");
				Employee2Map.put("Position","Marketing Manager");
				Employee2Map.put("Salary","85K Pounds");//
				Employee2Map.put("Email","bob@example.com");
				Employee2Map.put("PAN","REW6543211");
				//System.out.println("Employee 2 details :"+Employee2Map);
				
				
				//Employee3Map
				Map<String,String > Employee3Map = new HashMap<String,String>();
				Employee3Map.put("Employee ID","E003");
				Employee3Map.put("Name","Carol White");
				Employee3Map.put("Age","28");
				Employee3Map.put("Gender","Female");
				Employee3Map.put("Department","Sales");
				Employee3Map.put("Position","Sales Executive");
				Employee3Map.put("Salary","65K Pounds");
				Employee3Map.put("Email","carol@example.com");
				Employee3Map.put("PAN","TYR6543212");
				//System.out.println("Employee 3 details :"+Employee3Map);
				
				 
				
				//Product1Map
				Map<String,String > Product1Map = new HashMap<String,String>();
				Product1Map.put("Product ID","P001");
				Product1Map.put("Name","Laptop");
				Product1Map.put("Category","Electronics");
				Product1Map.put("Price","12K Pounds");
				Product1Map.put("Stock Quantity","50");
				Product1Map.put("Supplier","Tech Supplies");
				Product1Map.put("Warranty","2 years");
				Product1Map.put("Rating","4.5 stars");
				Product1Map.put("Manufacturing Date","Aug 2023");
				Product1Map.put("Expiry Date","Aug 2028");
				//System.out.println("Product 1 details :"+Product1Map);
				
				
				//Product2Map
				Map<String,String > Product2Map = new HashMap<String,String>();
				Product2Map.put("Product ID","P002");
				Product2Map.put("Name","Desk Chair");
				Product2Map.put("Category","Furniture");
				Product2Map.put("Price","150K Pounds");
				Product2Map.put("Stock Quantity","200");
				Product2Map.put("Supplier","Office Depot");
				Product2Map.put("Warranty","1 year");
				Product2Map.put("Rating","4 stars");
				Product2Map.put("Manufacturing Date","Sep 2024");
				Product2Map.put("Expiry Date","N/A");
				//System.out.println("Product 2 details :"+Product2Map);
				
				
				//Product3Map
				Map<String,String > Product3Map = new HashMap<String,String>();
				Product3Map.put("Product ID","P003");
				Product3Map.put("Name","Coffee Maker");
				Product3Map.put("Category","Kitchen");
				Product3Map.put("Price","$75");
				Product3Map.put("Stock Quantity","100");
				Product3Map.put("Supplier","KitchenWorld");
				Product3Map.put("Warranty","6 months");
				Product3Map.put("Rating","4.2 Stars");
				Product3Map.put("Manufacturing Date","Jan 2025");
				Product3Map.put("Expiry Date","Jan 2027");
				//System.out.println("Product 3 details :"+Product3Map);
				
				
				//Print the data from Product details > Supplier Name > Office Depot  from the   Map<String, Map<String,String>>

				
				List<Map<String,String>> studentList = new ArrayList<Map<String,String>>();
				studentList.add(StudentDetails1);
				studentList.add(StudentDetails2);
				studentList.add(StudentDetails3);
				System.out.println("Student List :"+studentList);
				
				List<Map<String, String>> empList = new ArrayList<Map<String,String >>();
				empList.add(Employee1Map);
				empList.add(Employee2Map);
				empList.add(Employee3Map);
				System.out.println("Employee List :"+empList);
				
				List<Map<String,String>> productList = new ArrayList<Map<String,String>> ();
				productList.add(Product1Map);
				productList.add(Product2Map);
				productList.add(Product3Map);
				System.out.println("Product List :"+productList);
				
				Map<String,List<Map<String,String>>> data = new HashMap<String,List<Map<String,String>>>();
				
				data.put("StudentData",studentList);
				data.put("EmployeeData",empList);
				data.put("ProductData",productList);
				
				System.out.println("All Data List :"+data);
				System.out.println("Displaying Supplier Name of 2nd row ProductData: "+data.get("ProductData").get(1).get("Supplier"));
				
				
				

}}
