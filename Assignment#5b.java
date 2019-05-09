/**Name: Tochi Iroakazi
 * Subject: ICS4U
 * Description: This program Develops a symmetri pattern about n where each half before and after n is also symmetric around n-1.
 */


import java.util.Scanner;

public class RecursionB {

	public static void main(String[] args) {
		 System.out.println ( "What number do you want to use for the number pattern ?" );
		 System.out.println("Enter a positive integer below 15: ");
		 Scanner scanner = new Scanner(System.in);
		 
		 //check if the numbr ha san integer in it.
		 if(scanner.hasNextInt()) {
	            int userNum = scanner.nextInt();       
	            System.out.print(symmetricPattern(userNum));
	        }
	        else {
	            System.out.println("Error");
	        } 
		

	}
	public static String symmetricPattern(int num) {
        
        String output = Integer.toString(num);

        String nextOuput;
        
        String result;
        
        
       if (num == 1) {
    	   result = output;
       }else {
    	   result = symmetricPattern(num - 1)  + " " + output  + " " + symmetricPattern(num - 1);
       }
       return result;
      
        
    }

}
