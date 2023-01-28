import java.util.Scanner;
import java.util.*;
import java.io.*;

public class GetDate {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number : ");  
		int number= sc.nextInt();

		
		
		int length = String.valueOf(number).length();
		
		System.out.println("Value Length is : " + length);
		
//		int[] index = new int[number] ;
		

		
		if(length == 7) {
			
			while(number != 0)
	        {
//	            firstDigit = number % 10;
//	            number = number / 10;
//	        }
//	        System.out.println("First Digit is: " + firstDigit);
	        
	      
//	        System.out.println("New number is : " + number);
//	        
//	        System.out.println("So, again enter same number" );
//	        Scanner sc1= new Scanner(System.in);
//			System.out.print("Enter number : ");  
//			int number1= sc.nextInt();
//			System.out.println("The number is :" + number1);
//			
//			
//			int secondDigit = number1 % 100;
//			number = number / 10;
//			System.out.println("Second Digit is: " + secondDigit);
//			
//			int thirdDigit = number1 % 1000;
//			number = number / 100;
//			System.out.println("Third Digit is: " + secondDigit);
			
				
				 int firstDigit = Integer.parseInt(Integer.toString(number).substring(1));
				 System.out.println("After removing first Digit from a number is :" + firstDigit);
			
				 
				    int year = firstDigit/10000 ;
					String month = String.valueOf(firstDigit).substring(2,4) ;
					int day = firstDigit%100;
					
					System.out.println("Current Date is :" + day +  "-"  + month + "-"+ "20"+ year  );
				 
			break ;

	        }    
//	        System.out.println(" The current date is"  );
			
	    
		}
		else {
			
			System.out.println("The number is :" + number);
			
			
			
			int year = number/10000 ;
			String month = String.valueOf(number).substring(2,4) ;
			int day = number%100;
			
			System.out.println("Previous Century Date is :" + day +  "-"  + month + "-"+ "19"+ year  );
			

		}
		
		}
}
		
		
//		int number[] = {1230124} ;
//		
//		int[] index = new int[7];
//		 index[0] = 1 ;
//		 index[1] = 2 ;
//		 index[2] = 3 ;
//		 index[3] = 0 ;
//		 index[4] = 1 ;
//		 index[5] = 2 ;
//		 index[6] = 4 ;


	
	

	

