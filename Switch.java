import java.util.Scanner;
public class Switch {
    public static void main (String [] agrs){
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess the whole number from 1 till 10: ");
        int wholeNumber = scan.nextInt();

        switch (wholeNumber) {
            case 1:
                System.out.println("I guessed not the number 1"); // 1
                break;
            case 2:
                System.out.println("I guessed not the number 2"); // 2
                break;
            case 3:
                System.out.println("I guessed not the number 3"); // 3
                break;
            case 4:
                System.out.println("I guessed not the number 4"); // 4
                break;
            case 5:
                System.out.println("I guessed not the number 5"); // 5
                break;
            case 6:
                System.out.println("I guessed not the number 6"); // 6
                break;
            case 7:
                System.out.println("I guessed the number 7"); // 7
                break;
            case 8:
                System.out.println("I guessed not the number 8"); // 8
                break;
            case 9:
                System.out.println("I guessed not the number 9"); // 9
                break;
            case 10:
                System.out.println("I guessed not the number 10"); // 10
                break;
            default:
                System.out.println("The number is: unknown");
                break;
        }

    }
}
