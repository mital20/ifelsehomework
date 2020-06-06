import java.util.Scanner;

public class InterchangedValue {

    public static void main(String[] args) { // main method
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("please enter the second number");
        int num2 = scanner.nextInt();
       // int num1 = 30; // Variable num1 before swapping
       // int num2 = 60; // variable num2 before swapping
        System.out.println("before swapping num1="+num1);
        System.out.println("before swapping num2="+num2);
        swap(num1,num2);
    }
    public  static void swap (int num1,int num2){ // calling swap method to hold numbers and swap them
       int temp=num1; // temporary holding variable num1 , num2
         num1=num2; // num1 is now 60
         num2=temp; // num2 is now 30
         System.out.println("After swapping num1="+num1);
         System.out.println("After swapping num2="+num2);

    }
}
