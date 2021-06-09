import java.io.*;
import java.util.*;
public class RecursiveArray {
   public static void main(String[] args){
      int[] myAry = new int[6];
      int sumOddAry=0;
      System.out.println("NAME: AYOUB");
      System.out.println("Project 13");
      System.out.println("Date: "+ (new java.util.Date()));
      System.out.println("Enter 3 even and 3 odd numbers: ");
      Scanner console = new Scanner(System.in);
      for(int i = 0; i<myAry.length; i++)
      {
         myAry[i] = console.nextInt();
      
      }
      for(int i = 0; i<myAry.length; i++)
      {
      if (myAry[i]%2==1)
      sumOddAry+=myAry[i];
      }    
      
      System.out.println("The array is " + Arrays.toString(myAry));
      System.out.println("The sum of 3 Odd numbers of the array is " + sumOddAry);
 

      
 
         
 }
 }
 
