import java.io.File;
import java.io.ReverseFile;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseFilee {
   public static void main(String[] args) throws Exception{
       String fname="";
       String output="";
       Scanner sc1=null;
       Scanner sc = new Scanner(System.in);
       while (true) {
           try {
               System.out.println("Please enter the file name for input: ");
               fname=sc.next();
               sc1=new Scanner(new File(fname));
               break;
           } catch (Exception e) {
               System.out.println("File not found.");
           }
       }
       ArrayList<String>lines=readFile(new File(fname));
       System.out.println("Enter outputfile name");
       output=sc.next();
       writeInReverse(output,lines);
       System.out.println("Reversed Successfully...!!!");
   }

   private static void writeInReverse(String name,ArrayList<String> lines) throws Exception {
       PrintWriter pw = new PrintWriter(new File(name));
       for(int i=lines.size()-1;i>=0;i--)
           pw.println(lines.get(i));
       pw.close();
   }

   private static ArrayList<String> readFile(File f) throws Exception {
       Scanner sc = new Scanner(f);
       return readLinesOfArray(sc);
   }

   private static ArrayList<String> readLinesOfArray(Scanner sc) {
       ArrayList<String> res=new ArrayList<String>();
       while(sc.hasNext())
           res.add(sc.nextLine());
       return res;
   }
}