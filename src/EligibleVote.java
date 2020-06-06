import java.util.Scanner;

public class EligibleVote {
    public static void main(String[]args)
    {   // program for person who is eligible to vote must be older than or equal to 18 years
        int age; // variable
        Scanner scanner=new Scanner(System.in);// java program to get user input
        System.out.print("Enter your age?"); //printed
        age=scanner.nextInt();
        // if and else statement if user can vote or not
        if(age>=18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");

    }







}




