package studio1;
import support.cse131.ArgsProcessor;
public class Average
{
    public static void main(String[] args)
    {
        ArgsProcessor ap = new ArgsProcessor(args);
        int one = ap.nextInt("What is your first number?");
        int two = ap.nextInt("What is your second number?");

        int sum = one + two;

        double average = sum / 2.0;

        System.out.println("Your average is " + average);
    }

}
