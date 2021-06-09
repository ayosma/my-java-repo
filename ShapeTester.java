//Name: Ayoub
import java.io.*;
import java.util.*;
public class ShapeTester
{
   public static void main(String[] args)
   {
      Triangle tr = new Triangle(3, 2);
      Circle1 ci = new Circle1(4.0);
      Rectangle re = new Rectangle(7.0,6.0);
      System.out.println("tr area is " + getArea(tr));
      System.out.println("ci area is " + getArea(ci));
      System.out.println("re area is " + getArea(re));
      
      System.out.println("returnZero: " + tr.returnZero());
      System.out.println(ci.returnName());
      
   }
   public static double getArea(Shape obj){
   return obj.area();
 }
 }    