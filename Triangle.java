//NAME: Ayoub
import java.io.*;
import java.util.*;
public class Triangle extends Shape
{
   private double h;
   private double b;
   public Triangle (double h,double b)
   {
      this.h = h;
      this.b = b;
   }
   //write overload area()
      public double area() {
      return b * h * 0.5;
   }
}