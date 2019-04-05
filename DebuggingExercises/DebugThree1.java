// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String[] args)
   {
      double mycheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calctip(mycheck);
      calctip(yourCheck);
    }
    public static void calctip(double bill)
    {
      final double RATE = 0.15;
      double tip;
      tip = bill + RATE;
      System.out.println("The tip should be at least " + tip);
    }
}
