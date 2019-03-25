/**
 * Name: Tochi Iroakazi
 * Class: ICS4U
 * Description: This program searches for a number in an Arraylist and without using "search" and sorts the Arraylist without using "sort" and prints out the position of the number you are searching for.
 */
import java.util.*;
public class BinarySearch {
 public static void main(String[] args) {
  //creating an empty stack
  ArrayList<Integer> list = new ArrayList<Integer> ();
  //add numbers into the array list
  for(int i = 0;  i < 249; i++) {
   Random generatenumber = new Random();
   int randnumber = generatenumber.nextInt(500) + 1;
   list.add(randnumber);
  }
  System.out.println("what number do u want to add the the list (1-500)?");
  Scanner input = new Scanner(System.in);
  int asked = input.nextInt();
  //while the number asked for is greater than 500 or less than 1. keep asking for the number until you get a number within 1 and 500.
  while ( asked >  500 || asked < 1) {
   System.out.println("The number has to be between 1 and 500");
   System.out.println("Try Again, what number do u want to add the the list (1-500)?");
   asked = input.nextInt();
  }
  // add the number asked for to the loop.
  list.add(asked);
  int size = list.size()-1;
 
  //print out the numbers in the array list
  System.out.println(list);
  System.out.println("there are " + list.size() + " numbers in the array list. ");
  System.out.println();
 
  // sort the numbers 
  for (int j = 0; j < list.size()-1; j++) {
   //get the first 2 consecutive numbers and sort them. Then move to the next two consecutive numbers
   if (list.get(j) > list.get(j+1)) {
    int move = list.get(j);
    list.set(j,list.get(j+1));
    list.set(j+1,move);
    j = -1;
   }
  }
  System.out.println("new sorted list is:");
  System.out.println(list);
 
 Search(list);
 
 }
 
 public static void Search (ArrayList<Integer> array){
 
  int first = 0;
  int last = array.size() - 1;
  int middle = (first + last) / 2;
  //ask for what number to search for.
  System.out.println("What number would you want to search for ?");
  Scanner searchinput = new Scanner(System.in);
  int searchnumber = searchinput.nextInt();
  // while the number searched for is not within the range. Ask again for the number.
  while ( searchnumber < array.get(0) || searchnumber > array.get(array.size() - 1)){
  
   System.out.println("The number you searched for is not withis the range of the arraylist");
   System.out.println("Try Again,  What number would you want to search for ?");
   searchnumber = searchinput.nextInt();
  }
 
  while ( first < last - 1) {
   // if the keep reducing the range of the first to last number until the search number equals the middle, first or last number.
     if ( searchnumber == array.get(middle) ) {
      System.out.println("the position of the number is " + (middle +1) );
      break;
     }else if (searchnumber == array.get(first)) {
      System.out.println("the position of the number is " + (first +1) );
      break;
     }else if (searchnumber == array.get(last)) {
      System.out.println("the position of the number is " + (last+1) );
     break; 
     }else if (searchnumber > array.get(middle) && searchnumber < array.get(last)) {
      first = middle + 1;
      middle = (first + last) / 2;
     }else if (searchnumber < array.get(middle) && searchnumber > array.get(first)){
      last = middle - 1;
      middle = (first + last) / 2;
     }else {
      System.out.println("the number is not in the arraylist");
      break;
     } 
  }
 
 }
}



