package assignments;

public class Assignment10_HighestNumbers {

	public static void main(String[] args) {
	//highest number	
		int [] numbers = {12,34,11,36,87,98,93};
		
		int firstmax = Integer.MIN_VALUE; // first we assumed value is minimum.
		for(int i=0;i < numbers.length; i++) {		
			if(numbers[i] > firstmax) {
				firstmax = numbers[i];
				} 
			} 
		int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondmax && numbers[i] != firstmax) {
                secondmax = numbers[i];
            }
        }
        int thirdmax = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > thirdmax && numbers[i] != firstmax && numbers[i] != secondmax) {
                thirdmax = numbers[i];
            }
        }
        System.out.println("Largest number: " + firstmax);
        System.out.println("Second largest number: " + secondmax);
        System.out.println("Third largest number: " + thirdmax);
		
		
	}}

