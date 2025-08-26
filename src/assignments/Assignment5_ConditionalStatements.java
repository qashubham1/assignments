package assignments;

public class Assignment5_ConditionalStatements {
	
	


	public static void main(String[] args) {
		
		String customerName = "John Doe";
		int creditScore = 320;
		double income = 55000.0;
		boolean isEmployed = false;
		double debtToIncomeRatio = 35.0;
		
		if(creditScore > 750) {//If the credit score is above 750, the loan is automatically approved.
			System.out.println("Credit score condition fullfills.Loan approves automatically");
			
			}else if(creditScore >= 650) {//If the credit score is between 650 and 750, additional checks are performed.
				
					if(income >= 50000) {//income must be at least $50,000 for the loan to be considered.
					
						if(isEmployed = true) { //If the customer’s income is at least 50,000, the system checks whether the customer is employed.
						
						if (debtToIncomeRatio < 100.0) { //If the DTI ratio is less than 40%, the loan is approved.
							System.out.println("Codition fullfills. Loan is approved");
							
						}else {
							System.out.println("Loan is rejected");
						}
						System.out.println("Person is employed. Application will be accepted");
						
					}else {
						System.out.println("No chance");
					}
					System.out.println("Income is Good.Application will be considered");
				}
				System.out.println("Additonal documents required");
				
			}else if(creditScore < 650) {
				System.out.println("Loan rejected");
				
				
			}
			
		}
	}


