import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double CommissionRate;// double variable to get double digit
        double TotalSales, Commission;
        System.out.println("please enter your sales id");// java scanner to get user input
        scanner.nextInt();
        System.out.println("please enter your name");
        scanner.next();
        System.out.println("please enter your Basic Salary");
        int Salary = scanner.nextInt();
        System.out.println("Please enter total sales ");
        TotalSales=scanner.nextDouble();
        if (TotalSales>=50000) // amount of sales made over 50000
            CommissionRate=0.35;// 35% commission of salary
        else if (TotalSales>=49999 && TotalSales <= 30000) // sales made over 30000
            CommissionRate=0.20;// 20% commission of salary
        else if (TotalSales>=29999 && TotalSales <= 20000) // sales made over 20000
            CommissionRate=0.10; // 10% commission of salary
        else if (TotalSales>=19999 && TotalSales <= 10000)// sales made over 10000
            CommissionRate=0.05; // 5% commission of salary
        else
            CommissionRate=0.02; //2% commission of salary when sales made under 10000
        Commission = CommissionRate * TotalSales;
        System.out.println(("The Total of salary and Commission is: "+ '£' +(Salary+Commission)));
        // total addition of salary once commission added


    }}






