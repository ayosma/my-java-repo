import java.util.*;
public class BatteryTester {

        public static void main(String[] args)    
     {
      
      System.out.println("1. Student's name: Ayoub"); 
      System.out.println("2. Project 8.4");
      System.out.println("3. Start testing: " + (new Date()));
      System.out.println("4. Create Battery object with 2000 mAh of charge");
      Battery myBattery = new Battery(2000);
      System.out.println("5. Remaining capacity: " + myBattery.getRemainingCapacity());
      System.out.println("6. Expected..........: 2000");
      System.out.println("7. drain 1000 mAh");
      myBattery.drain(1000);
      System.out.println("8. Remaining capacity: " + myBattery.getRemainingCapacity());
      System.out.println("9. Expected..........: 1000");
      System.out.println("10.Charge the Battery");
      myBattery.charge();
      System.out.println("11.Remaining capacity: " + myBattery.getRemainingCapacity());
      System.out.println("12.Expected..........: 2000");
      System.out.println("13.End of testing");      
   
}
}