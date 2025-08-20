package assignments;

public class Assignment2_3DArray_T2  {

//	1. Create a 3D array to represent the following data:
//	o Semesters as the first dimension.
//	o Subjects and Status/Marks as the second dimension.
//	o Actual values for Subject Names and Marks as the third dimension.
	
	public static void main(String[] args) {

		// 5 semesters, 2 rows (subjects & marks), 6 values each
		//o Print Semester 2 Subject 4 and Subject 5 names.
		//o Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		
		String [][][] data = new String [5][2][6];
		 // Sem 1
        data[0][0][0] = "Mathematics I";
        data[0][0][1] = "Physics";
        data[0][0][2] = "Chemistry";
        data[0][0][3] = "Computer Programming";
        data[0][0][4] = "Engineering Drawing";
        data[0][0][5] = "Basic Electrical Eng.";

        data[0][1][0] = "78(Pass)";
        data[0][1][1] = "85(Pass)";
        data[0][1][2] = "21(Fail)";
        data[0][1][3] = "74(Pass)";
        data[0][1][4] = "88(Pass)";
        data[0][1][5] = "79(Pass)";

        // Sem 2
        data[1][0][0] = "Mathematics II";
        data[1][0][1] = "Mechanics";
        data[1][0][2] = "Environmental Sci.";
        data[1][0][3] = "Basic Electronics";
        data[1][0][4] = "Engineering Physics";
        data[1][0][5] = "Engineering Graphics";

        data[1][1][0] = "82(Pass)";
        data[1][1][1] = "77(Pass)";
        data[1][1][2] = "93(Pass)";
        data[1][1][3] = "19(Fail)";
        data[1][1][4] = "24(Fail)";
        data[1][1][5] = "90(Pass)";

        // Sem 3
        data[2][0][0] = "Data Structures";
        data[2][0][1] = "Discrete Mathematics";
        data[2][0][2] = "Digital Electronics";
        data[2][0][3] = "Operating Systems";
        data[2][0][4] = "Signals and Systems";
        data[2][0][5] = "Object-Oriented Prog.";

        data[2][1][0] = "88(Pass)";
        data[2][1][1] = "81(Pass)";
        data[2][1][2] = "76(Pass)";
        data[2][1][3] = "32(Fail)";
        data[2][1][4] = "85(Pass)";
        data[2][1][5] = "78(Pass)";

        // Sem 4
        data[3][0][0] = "Algorithms";
        data[3][0][1] = "Computer Networks";
        data[3][0][2] = "Database Systems";
        data[3][0][3] = "Microprocessors";
        data[3][0][4] = "Communication Eng.";
        data[3][0][5] = "Software Engineering";

        data[3][1][0] = "91(Pass)";
        data[3][1][1] = "73(Pass)";
        data[3][1][2] = "19(Fail)";
        data[3][1][3] = "80(Pass)";
        data[3][1][4] = "76(Pass)";
        data[3][1][5] = "87(Pass)";

        // Sem 5
        data[4][0][0] = "Probability & Stats";
        data[4][0][1] = "Machine Learning";
        data[4][0][2] = "Compiler Design";
        data[4][0][3] = "Theory of Computation";
        data[4][0][4] = "Embedded Systems";
        data[4][0][5] = "Computer Graphics";

        data[4][1][0] = "86(Pass)";
        data[4][1][1] = "88(Pass)";
        data[4][1][2] = "84(Pass)";
        data[4][1][3] = "95(Pass)";
        data[4][1][4] = "73(Pass)";
        data[4][1][5] = "90(Pass)";
		
        System.out.println("Semester 2 Subject 4 :" +  data[1][0][3]); 
        System.out.println("Semester 2 Subject 5 :" +  data[1][0][4]);
        System.out.println("Status/Marks of Semester 4 Subject 3 :" +  data[3][1][2]);
        System.out.println("Status/Marks of Semester 4 Subject 6 :" +  data[3][1][5]);

	}

}
