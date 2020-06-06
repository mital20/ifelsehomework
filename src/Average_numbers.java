import java.util.Scanner;

public class Average_numbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);// java program to check average of 5 numbers

            System.out.print(" Enter first number: ");//  input for user to enter first number
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");// input for user to enter second number
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: "); // input for user to enter third  number
            int num3 = scanner.nextInt();

            System.out.print("Enter fourth number: ");// input for user to enter fourth number
            int num4 = scanner.nextInt();

            System.out.print("Enter fifth number: "); // input for user to enter fifth number
            int num5 = scanner.nextInt();


            System.out.println("Average of five numbers is: " +
                    (num1 + num2 + num3 + num4 + num5) / 5);//string Concatenation
        }      // adding all ans getting the average





}

