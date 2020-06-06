import java.util.Scanner;

public class Days_Of_Week {

    public static void main(String[] args) {// main method
        int week; // variable to check days of the week
        Scanner scanner = new Scanner(System.in);//
        System.out.println("Enter any number");//
        week = scanner.nextInt();
        //if and else statement to check by clicking on 1 prints monday

        if (week ==1){// if the user enter 1, monday should print
            System.out.println("Monday");
        }
        else if (week ==2){// if user enter 2, tuesday should print
            System.out.println("Tuesday");
        }
        else if (week ==3){ // if user enter 3 , wednesday should print
            System.out.println("wednesday");
        }
        else if (week ==4){ // if user enter 4 , thursday should print
            System.out.println("Thursday");
        }
        else if (week ==5){ // if user enter 5, friday should print
            System.out.println("Friday");
        }
        else if ( week ==6){ // if user enter 6 , saturday should print
            System.out.println("Saturday");
        }
        else if (week ==7){ // if user enter 7 , sunday should print
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid"); // if user enter any other number
            // it will count as Invalid
            }



    }
}
