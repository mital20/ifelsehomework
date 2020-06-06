import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class odd_Even // class of java
{ public static void main(String[] args) // main method
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter number:");// user can enter the number of their choice
    int number = scanner.nextInt();
    String odd_even = (number%2==0) ?"even" : "odd"; // using ternary operator to find out odd and even
    System.out.println(number + " is " + odd_even);
  }
  }





