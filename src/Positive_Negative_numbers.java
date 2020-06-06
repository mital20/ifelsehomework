import java.util.Scanner;

public class Positive_Negative_numbers {

    public static void main(String[] args) { // Finding out if the number is positive negative or zero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");// java program to user input
        int num = scanner.nextInt();
        if(num > 0)
        {
            System.out.println("Number is POSITIVE");
        }
        else if(num < 0)
        {
            System.out.println("Number is NEGATIVE");
        }
        else
        {
            System.out.println("Number is ZERO");
        }

    }
}
