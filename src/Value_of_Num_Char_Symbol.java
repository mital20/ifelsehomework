import java.util.Scanner;

public class Value_of_Num_Char_Symbol {

    public static void main(String[] args){
        int ch; // local variable
        Scanner scanner = new Scanner(System.in);// checking output
        System.out.println("Enter any number, alphabet or symbol");
        ch = scanner.nextInt();
        // creating if and else statement, if user enters any value it shows correct value

        if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))//string Concatenation
        ){
            System.out.println(ch+ "is alphabet.");// printing alphabet character
        }
        else if (ch >= '0' && ch <= '9'){ //string Concatenation

            System.out.println( ch +"is number.");// printing number
        }
        else
            {
            System.out.println(ch +"is special symbol");// printing symbol
        }








    }
}
