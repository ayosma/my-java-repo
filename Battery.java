//@Author, Ayoub 
 public class Battery
{
   private double remaining_capacity;
   private double original_capacity;
  
   public Battery( double capacity )          // capacity of the battery measured in mAh(milliampere hours)
   {
      this.original_capacity = capacity;
      this.remaining_capacity = capacity;
   }                                               
   public void drain ( double amount )          // drains the battery @param amount
   {
      remaining_capacity -= amount;
   }
   public void charge()                         // charges the battery
   {
      remaining_capacity = original_capacity;  // sets the remaining capacity to original after the battery is charged
   }
   public double getRemainingCapacity()
   {
      return remaining_capacity;                // returns the remaining capacity
   }
}