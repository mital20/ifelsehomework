import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) { // main method

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any alphabet");
        char n = scanner.next().charAt(0);
        // inputting vowels and consonant ad running them
        if ((n == 'a'|| n =='e'|| n == 'i'|| n == 'o' || n == 'u')||
        (n == 'A'|| n == 'E'|| n == 'I'|| n == 'O' || n == 'U')){
            System.out.println(n + " is vowel.");// it should print its a vowel
        }
        else {
            System.out.println((n + " is Consonant.")); // it should print consonant
        }


    }
}
