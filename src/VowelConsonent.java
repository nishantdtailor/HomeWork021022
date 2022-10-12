import java.util.Scanner;

public class VowelConsonent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input an alphabet:");
        char c = scanner.next().charAt(0);

                switch (c){

                    case 'a':
                    case 'A':
                        System.out.println("Input letter is Vowel ");
                        break;
                    case 'e':
                    case 'E':
                        System.out.println("Input letter is Vowel");
                        break;
                    case 'i':
                    case 'I':
                        System.out.println("Input letter is Vowel");
                        break;
                    case 'o':
                    case 'O':
                        System.out.println("Input letter is Vowel");
                        break;
                    case 'u':
                    case 'U':
                        System.out.println("Input letter is Vowel");
                        break;
                    default:
                        System.out.println("Input letter is Consonant");


                }




            }

        }


