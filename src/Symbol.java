import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        int a, b, ans; // variables
        char n; //  character
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number ");// java program to get user input
        a = scanner.nextInt();
        System.out.println("Enter another number");
        b = scanner.nextInt();
        System.out.println ("Enter Operator (+, -, *, /) : ");// java program to get user input to enter operator
        n = scanner.next().charAt(0);

        if ( n =='+'){ // addition
             ans = a + b;
                System.out.print("Result = " +ans);}
        else if ( n == '-'){ // subtraction
            ans = a - b;
            System.out.println(("Result = "+ans)); }
        else if(n == '*'){ // muticaltion
            ans = a * b;
                System.out.print("Result = " +ans); }
        else if(n == '/'){ // divide
                ans = a / b;
                System.out.print("Result = " +ans); }
        else { // if different symbol used it will be wrong operator used
                System.out.print("Wrong Operator !!!");
            }






        }



    }

