import java.util.Scanner;
public class IfElse {
    public static void main (String[] agrs) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess the whole number from 1 till 10: ");
        int wholeNumber = scan.nextInt();

        if (wholeNumber == 1) {
            System.out.println("I guessed not the number 1");
        } else if (wholeNumber == 2){
            System.out.println("I guessed not the number 2");
        }
        else if (wholeNumber == 3){
            System.out.println("I guessed not the number 3");
        }
        else if (wholeNumber == 4){
            System.out.println("I guessed not the number 4");
        }
        else if (wholeNumber == 5){
            System.out.println("I guessed not the number 5");
        }
        else if (wholeNumber == 6){
            System.out.println("I guessed not the number 6");
        }
        else if (wholeNumber == 7){
            System.out.println("I guessed the number 7");
        }
        else if (wholeNumber == 8){
            System.out.println("I guessed not the number 8");
        }
        else if (wholeNumber == 9){
            System.out.println("I guessed not the number 9");
        }
        else if (wholeNumber == 10){
            System.out.println("I guessed not the number 10");
        }
        else {
            System.out.println("the whole number more than 10 ");
        }
    }
}
