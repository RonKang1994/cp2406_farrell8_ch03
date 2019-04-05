public class Percentages
{
    public static void main(String[] args)
    {
        double num1 = 2;
        double num2 = 5;
        cal_percentage(num1, num2);
        cal_percentage(num2, num1);
    }

    public static void cal_percentage(double num1, double num2)
    {
        double percentage = (num1 / num2) * 100;
        System.out.println( num1 + " is " + percentage + "% of " + num2);
    }
}
