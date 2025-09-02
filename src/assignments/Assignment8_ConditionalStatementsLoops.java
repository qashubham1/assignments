package assignments;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {
		
		int [] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };// store transactions
		
		// we have to find cr and dr transactions. so first store it into a variable.
		int cr = 0;// Total cr transactions
		int dr = 0;
		int cramt = 0;// Total amt credited
		int dramt =0;
		int sus_Transactions =0;// suspicious transactions
		
		// we have to find each transaction whether its dr or cr.
		for (int trans : transactions) {
			
			if(trans > 0) {
				
				cr++;
				cramt += trans;
				
				if(trans > 10000) {
					
					System.out.println("Suspicious credit transaction with Amount: " + trans);
					sus_Transactions++;
				}	
			}else {
				dr++;
				dramt -= trans;
				
				if(trans < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + trans);
					sus_Transactions++;
					
				}
				
//			1. Print total number of credit and debit transactions completed.
				
			System.out.println("Total number of cr transactions :"+ cr);
			System.out.println("Total number of dr transactions :"+ dr);

			
			
//			2. Print the total amount credited and debited in account
			
			System.out.println("Total amount of credited: "+ cramt);
			System.out.println("Total amount of debited: "+ dramt);
			
//			3. Print total amount remaining at the end in Bank Account
			
			int bal = cramt - dramt;
			System.out.println("total amount remaining :"+ bal);
			
//			4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
//			Transaction with Amount” and also print total number of suspicious transactions
			
			System.out.println("Total suspicious transactions :"+ sus_Transactions);
			
			 }
		}		
	}

}
