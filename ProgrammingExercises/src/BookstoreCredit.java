import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        // Used to store the student's GPA
        float gpa = 0;
        //Used to store the student's name
        String name = "null";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: " );
        name = input.next();
        System.out.print("Enter your gpa: " );
        gpa = input.nextFloat();
        cal_credit(gpa, name);

    }

    //Used to calculate the students Credit amount based on GPA
    public static void cal_credit(float gpa, String name)
    {
        float credit = gpa * 10;
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Credit recieved: $" + credit );
    }
}
