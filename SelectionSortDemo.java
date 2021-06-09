import java.util.Arrays;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class SelectionSortDemo
{  
   public static void main(String[] args)
   { 
      System.out.println("1. Name: Ayoub Osman");
      System.out.println("2. Project: Ch14 Sort a list in descending order");
      System.out.println("3. Date: " + (new java.util.Date()));
      int[] a = ArrayUtil.randomIntArray(20, 100);
      System.out.println("4. An randomized array: " + Arrays.toString(a));

      SelectionSorter.sort(a);

      System.out.println("5. The sorted arrary in decending order: " + Arrays.toString(a));
   }
}

   
