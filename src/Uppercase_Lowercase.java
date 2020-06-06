import java.util.Scanner;

public class Uppercase_Lowercase {
// checking if user types in uppercase it should print lower case
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in uppercase");//printing in uppercase
        String one = scanner.nextLine(); // variable

        System.out.println("type in lowercase");// printing in lower case
        String two = scanner.nextLine();
// swapping the alphabet
        System.out.println(one);
        System.out.println(one.toLowerCase());
        System.out.println(two);
        System.out.println(two.toUpperCase());// running it
    }


}

