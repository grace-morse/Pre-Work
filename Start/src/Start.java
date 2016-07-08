import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		
		int number=0;
		int reversenumber = 0;
		//Declared and initialized variables
		
		System.out.println("Enter a number that will be reversed:");
		//Prompting the user to "Enter a number that will be reversed:"
		
		Scanner input = new Scanner(System.in);
		
		number = input.nextInt();//number becomes whatever was inputed by the user
		input.close();
		while (number !=0)//number is no longer 0 (!= not equal to) so it will run the loop
		{	
			
			reversenumber = reversenumber * 10;
			reversenumber = reversenumber + number % 10;
			number = number/10;
		
		} /*For my understanding  Example if user entered 1234 
		1st loop
		0 = 0 * 10              reversenumber NOW is 0
		
		0 = 0 + 1234 % 10       
		  = 0 + 4		        reversenumber NOW is 4
		  
		1234 = 1234/10          number NOW is 123
		
			second loop
			4 = 4 * 10              reversenumber NOW is 40
			
			40 = 40 + 123 % 10      
			   = 40 + 3				reversenumber NOW is 43
			   
			123 = 123/10            number is NOW 12
			
		starting to the see pattern, will continue will loops until	reversed number is 4321	
		 */
		
		System.out.println("Your number reversed is:" + reversenumber);
	}

}
