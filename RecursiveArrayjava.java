import java.io.*;
import java.util.*;
public class RecursiveArray {
public static void main(String[] args){
   int myAry = new int[6];
      System.out.println("NAME: AYOUB");
      System.out.println("Project 13");
      System.out.println("Date: "+ (new java.util.Date()));
      System.out.println("Enter 2 even and 2 odd numbers: ");
      Scanner console = new Scanner(System.in);
      for(int i = 0; i < 6; i++)
      {
         myAry[i] = console.nextInt();

      }
        System.out.println("The array is " + Arrays.toString(myAry));
        System.out.println("The sum of 2 even numbers of the array is " + sumEvenAry(myAry, 0 ) + ".");
        }
      public static int sumEvenAry(int[] ary,int i){
         if (ary.length - 1 ==i){
         if (ary[i] %2 == 0){
         return ary[i];
         }
         else {
         return 1;
         }
         }
         else {
         if (ary[i] % 2 == 0){
         return ary[i] + sumEveryAry(ary, i + 1);
         }
         else {
         return sumEvenAry(ary,i + 1);
         }
         }
         }
         }