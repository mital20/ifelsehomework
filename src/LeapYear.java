public class LeapYear // class of java
{ public static void main(String[]args) // main method
   {
       // defining a variable
       int year = 1989;
       if (((year % 4 ==0) && (year % 100 != 0)) && (year % 400==0)) //if and else statement checking for leap year
       {
           System.out.println("Leap Year");// yes it is leap yeah
       }
       else
           {
           System.out.println("Common Year");// no its a leap year
           }


    
}}
