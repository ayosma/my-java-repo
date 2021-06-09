import java.util.Scanner;
//@author, Ayoub Osman
//v1.0
public class GradeAverage  {
   public static void main(String[] args ) {
    
       double testWeight;
       double midTermWeight;
       double finalWeight;
       double test1;
       double test2;
       double test3;
       double testAverage;
       double midTermAverage;
       double finalAverage;
       double midterm;
       double finalexam;
       double gradeAverage;
       char letterGrade;
       
       
       testWeight = 0.4;
       midTermWeight = 0.25;
       finalWeight = 0.35;
              
   
      Scanner input = new Scanner (System.in);  {
      System.out.println("Please enter your score for Test 1");
      test1 = input.nextDouble();
      System.out.println("Please enter your score for Test 2");
      test2 = input.nextDouble();
      System.out.println("Please enter your score for Test 3");
      test3 = input.nextDouble();
      System.out.println("Please enter your score for midterm");
      midterm = input.nextDouble();
      System.out.println("Please enter your score for finalexam");
      finalexam = input.nextDouble();
      testAverage = (test1 + test2 + test3) * testWeight;
      midTermAverage = (midterm * midTermWeight);
      finalAverage = (finalexam * finalWeight);
      gradeAverage = (testAverage + midTermAverage + finalAverage) / 3;
      
      System.out.println("Test1 is  "+ test1);
      System.out.println("Test2 is  "+ test2);
      System.out.println("Test3 is  "+ test3);


      System.out.println("Your grade point average is  "+ gradeAverage);
      
      if (gradeAverage < 70.0)  {
      
   letterGrade = 'C';


    } else if ((gradeAverage > 70)) {
    
    
    letterGrade = 'B'
    
    } else if (gradeAverage > 

          
    }
  }   
}   