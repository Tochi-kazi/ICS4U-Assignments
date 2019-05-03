/**Name: Tochi Iroakazi
 * Subject: ICS4U
 * Description: This program Develops a symmetri pattern about n where each half before and after n is also symmetric around n-1.
 */



import java.util.*;
public class RecursionC {
 public static void main(String[] args) {
  System.out.println ( "Whats  amount of stars do you want to make: " );
  Scanner scanner = new Scanner(System.in);
  int count = 1 ;
   if(scanner.hasNextInt()) {
	   Asterisks (scanner.nextInt(), count);
         }
         else {
             System.out.println("Type in a Valid number");
         }
  
  
 }
 public static void Asterisks (int star, int next) {
	 
	 
	 if ( next == star) {
		 //this part is correct
		 //i made the b equal 1 so it starts with two stars
		 for(int b = 1; b < next; b++) {
			 //System.out.print("");
			 for(int n = b + 1;  n < next; n++) {
				 System.out.print(" ");
			 }
			 //increase the b by one to get it to start with two stars
			 for (int h = b; h >= 0; h--) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 return;
	 }else if ( next != star) {
		 //prints out a space before each line
		 for ( int i = star; i > 0; i--){
	         //System.out.println(" ");
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

