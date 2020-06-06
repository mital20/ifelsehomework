import java.util.Scanner;

public class SubjectMarks
{
    public static void main(String[] args )
    { // a program for students marks grading for 3 different subjects
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter student name");
        scanner.next();// variable string for name
        System.out.println("Please enter roll number");
        scanner.nextInt(); //variable number
        System.out.println("please enter English marks");
        int eng = scanner.nextInt();// variable for subjects
        System.out.println("please enter your maths marks");
        int maths = scanner.nextInt();
        System.out.println("please enter your Science marks");
        int science = scanner.nextInt();
        int total = eng + maths + science;
        double percentage = total/3;// double // working out three percentage
        System.out.println("Total marks ="+total);// checking for total marks
        System.out.println("percentage = "+percentage);
        if (percentage < 35) // if and else statement for student grading by working out percentage of three subjects
        {
            System.out.println("Fail"); // fail if the percentage is below 35 in all three subjects
        }
        else if (percentage >= 35 && percentage < 50)
        {
        System.out.println("C grade"); // grade for passing between greater than 35 and less than 50
        }
        else if (percentage >=50 && percentage < 60) // grade for passing between greater than 50 and less than 60
        {
            System.out.println("B grade");
        }
        else if (percentage >=60 && percentage <80)//grade for passing between greater than 60 and less than 80
        {
            System.out.println("A grade");
        }
        else if (percentage >=80 && percentage <=100)//grade for passing between greater than 80 and less than 100
        {
            System.out.println("A+ grade");
        }

    }}
