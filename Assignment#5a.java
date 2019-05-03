import java.util.Scanner;
public class RecursionA {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
 
 
  //the input part of the program.
  System.out.println("Enter the number you want to convert: ");
  //getting the input
  String input = scanner.next();
  System.out.println("the input is " + input.charAt(0));
  //the length of the numbers in the string
  //it give a diffrent number when using charAt(0), so i hav to change it to a string and then an int
  int remain =  input.length();
  //the first number in the input. note the system thinks charAt(1) in 23 is 3
  int first =  input.charAt(0);

  int counter = 0;
 NumDig(first,input, remain, counter );

 
 }
 
  public static void NumDig(int next, String nums, int length,int place ) {
  //length is the  length of numbers in the string
 // the first number in the input. note the system thinks charAt(1) in 23 is 3.
  char [][] alphas = { {' '},{' '},{'a','b','c',},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

  System.out.println();
  if (place == 0) {
	  // go through all the characters from the first one and print out the characters 
	  for ( int a = 0; a < alphas[Integer.parseInt(Character.toString(nums.charAt(0)))].length; a++) {
		   for ( int b = 0; b < alphas[Integer.parseInt(Character.toString(nums.charAt(1)))].length; b++ ) {
		    for ( int c = 0; c < alphas[Integer.parseInt(Character.toString(nums.charAt(2)))].length; c++ ) {
		     for ( int d = 0; d < alphas[Integer.parseInt(Character.toString(nums.charAt(3)))].length; d++) {
		      for ( int e = 0; e < alphas[Integer.parseInt(Character.toString(nums.charAt(4)))].length; e++) {
		       for ( int f = 0; f < alphas[Integer.parseInt(Character.toString(nums.charAt(5)))].length; f++) {
		        for ( int g = 0; g < alphas[Integer.parseInt(Character.toString(nums.charAt(6)))].length; g++) {
		        	//print out the character
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(0)))][a] );
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(1)))][b] );
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(2)))][c] );
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(3)))][d] );
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(4)))][e] );
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(5)))][f] );
		         System.out.print(alphas[Integer.parseInt(Character.toString(nums.charAt(6)))][g] + ", ");
		        }
		       }
		      }
		     }
		    }
		   }
		   System.out.println( );                                                        
		  } 
  }

   
  
  //return;
  

 
  place++;
 
  //place represents the number of times the recursion has happened 
  if (place == 1) {
   int nexts  =  nums.charAt(place);
   //Recursion to run the code again
   NumDig(nexts, nums,  length, place);
  }else {
    System.out.println("Stop");
  }
 
 
 }
 
}


