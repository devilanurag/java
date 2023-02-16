//wap in java to print all even numbers present in array

public class EvenNumbersInAnArray { 
   public static void main(String args[]){ 
      int[] myArray = {23, 93, 56, 92, 39}; 
      System.out.println("Even numbers in the given array are:: "); 
 
      for (int i=0; i<myArray.length; i++){ 
         if(myArray[i]%2 == 0){ 
            System.out.println(myArray[i]); 
         } 
      } 
}}