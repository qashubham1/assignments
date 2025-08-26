package assignments;

public class Assignment6_Operators {

	public static void main(String[] args) {
		
		String[] studentNames = {"Suresh","Mahesh","Naresh"};
		int[] studentMarks = {75, 80, 82};
		
		int[] updatedMarks = new int[3];// temporary array to store updated marks
		
		updatedMarks [0] = studentMarks [0] +   10;
		updatedMarks [1] = studentMarks [1] +	10;
		updatedMarks [2] = studentMarks [2] +	10;
		
		System.out.println("Updated Marks:");
		System.out.println(studentNames[0] +":"+ updatedMarks [0]);
		System.out.println(studentNames[1] +":"+ updatedMarks [1]);
		System.out.println(studentNames[2] +":"+ updatedMarks [2]);
		
		
		int avgmarks = updatedMarks[0] + updatedMarks[1] + updatedMarks[2];
		System.out.println("Average Marks: " + avgmarks/3);



	}

}
