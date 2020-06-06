import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) { //  main method
        Scanner scanner = new Scanner(System.in);// java scanner to get user input
        System.out.println("please enter your employee id: ");
        scanner.nextLine(); //
        System.out.println("please enter your name");
        scanner.nextLine();
        System.out.println("Please enter your Basic salary");
        char x = '£'; // created a variable character
        System.out.println(x);
        int Salary = scanner.nextInt();
        int hra = ((Salary*10)/100);// checking hra 10% of salary
        int da = ((Salary*8)/100);// checking da 8% of salary
        int ta = ((Salary*9)/100);// checking ta 9% of salary
        int pf = ((Salary*20)/100);// checking PF 20% and deducting from salary
        System.out.println("Gross salary:"+ '£'+(Salary+hra+da+ta-pf));// total addition of salary and commisation






        }



    }

