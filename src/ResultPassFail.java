import java.util.Scanner;

public class ResultPassFail {
    public static void main(String[] args )
    { // a program for students marks grading for 3 different subjects
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter student name");// java program to put user input
        scanner.next();
        System.out.println("Please enter roll number");// java program to put user input
        scanner.nextInt();
        System.out.println("please enter English marks");
        int eng = scanner.nextInt();
        System.out.println("please enter your maths marks");// java program to put user input
        int maths = scanner.nextInt();
        System.out.println("please enter your Science marks");
        int science = scanner.nextInt();
        System.out.println(eng);
        if (eng >35){// if and else statement to check if the user has passed english
            System.out.println(" you have Passed English");
        }
        else if (eng <35){ // if and statement to check if the user has failed english
            System.out.println(" you have Failed English");
            System.out.println(maths);

        if (maths >35){ // if else statement to check if the user has pass or failed
            System.out.println(" you have Passed Maths");
        }
        else if (maths <35){
            System.out.println(" You have Failed Maths");
        }
            System.out.println(science);
        if (science >35){
            System.out.println(" you have Passed science");
        }
        else if (science <35){
            System.out.println(" you have Failed science");
        }



    }
    }}











