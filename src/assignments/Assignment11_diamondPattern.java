package assignments;

public class Assignment11_diamondPattern {

	public static void main(String[] args) {
		
		int n=5; // rows in first half
		
		for(int i=1; i <= n ; i++) { // upper half
			
			for(int j=n; j> i; j--){ // spaces
				
				System.out.print(" ");	
			}
						
			 for (int j = 1; j <= i; j++) { // numbers
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
		
		 // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	
	}}
		
		
		
		
	

