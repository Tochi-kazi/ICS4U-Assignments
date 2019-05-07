/**Name: Tochi Iroakazi
 * Subject: ICS4U
 * Description: This program Develops a star pattern in an hourglass shape the runs on recursion.
 */



import java.util.*;
public class RecursionC {
 public static void main(String[] args) {
  System.out.println ( "What  amount of stars do you want to make: " );
  Scanner scanner = new Scanner(System.in);
  int count = 0 ;
  //check if the user typed in an integer
   if(scanner.hasNextInt()) {
	   Asterisks (scanner.nextInt(), count);
         }
   //if user did not type in an integer
         else {
             System.out.println("Type in a Valid number");
         }
  
  
 }
 public static void Asterisks (int star, int next) {
	 //prints out the bottom part of the hour glass 
	 if ( next == star) {
		 
		 for(int b = 1; b < next; b++) {
			 for(int n = b + 1;  n < next; n++) {
				 System.out.print(" ");
			 }
			 //prints out two stars to start instead of one 
			 for (int h = b; h >= 0; h--) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 return;
		 //prints out the top part of the hour glass 
	 }else if ( next != star) {
		 //prints out a space before each line
		 for ( int i = star; i > 0; i--){
	         //k is equal to i which is the number of which goes down by one after each loop. k then prints out i spaces ( to give it the  top hour glass shape) 
	        for ( int k = i; k < star; k++){
	             System.out.print(" ");
	        }
	        //prints out the stars as the j 
	        for( int j = i; j > 0; j--){
	            System.out.print("* ");
	        }
	        System.out.println();
	        
	     }
		 next = star;
		 
		 Asterisks  (star,  next);
	 }
	 
	 
	 
     
 }

 

}

