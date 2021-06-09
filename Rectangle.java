//NAME: Ayoub
import java.io.*;
import java.util.*;
public class Rectangle extends Shape
{
   private double l;
   private double w;
   public Rectangle (double l, double w)
   {
      this.l = l;
      this.w = w;
   }
   //write overload area
   public double area() {
   return l * w;
  }
  }