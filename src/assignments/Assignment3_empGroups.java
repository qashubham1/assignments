package assignments;

public class Assignment3_empGroups {

	public static void main(String[] args) {
		
		// to access variables from another class we can create obj.
		
		Assignment3_Employees obj = new Assignment3_Employees();
		
		//we have to create array to store names & ID's
		
		String[] employeeNames  = new String[3];// understand syntax of array
		
		
		employeeNames [0] = obj.employeeName1;
		employeeNames [1] = obj.employeeName2;
		employeeNames [2] = obj.employeeName3;
		
		int[] employeeIDs = new int[3];
		employeeIDs[0] = obj.employeeID1;
		employeeIDs[1] = obj.employeeID2;
		employeeIDs[2] = obj.employeeID3;

		//print each employee's name along with their corresponding ID.
		
		System.out.println("Employee Name: "+ employeeNames [0]+" " +"Employee ID: " + employeeIDs[0] );
		System.out.println("Employee Name: "+ employeeNames [1]+" " +"Employee ID: " + employeeIDs[1] );
		System.out.println("Employee Name: "+ employeeNames [2]+" " +"Employee ID: " + employeeIDs[2] );
		
		


	}	


}
