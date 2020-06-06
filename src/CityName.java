import java.util.Scanner;

public class CityName {

    public static void main(String[] args) { // main method
        String letter; // created string object

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet A to z");
        letter = scanner.next();
// running a program when user enter a to f alphabet  it should print city name
        if (letter.equals("a")){
            System.out.println("Ahmedabad");
        }
        else if (letter.equals("b")){ // entering alphabet b
            System.out.println("Bern");
        }
        else if (letter.equals( "c")){ // entering alphabet c
            System.out.println("Cairo");
        }
        else if (letter.equals("d")){
            System.out.println(" Delhi");
        }
        else if ( letter.equals("e")){
            System.out.println("Elpaso");
        }
        else if (letter.equals("f")){
            System.out.println("Frankfort");
        }
        else {
            System.out.println("invalid");// if the user enter any other alphabet then it will be invalid
        }













}}

