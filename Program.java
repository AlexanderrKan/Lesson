import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Formula: y=(2x+5x)/4x ");
        System.out.print("Enter x number: ");
        int x = in.nextInt();
        int a = 2;
        int b = 5;

        double Y = (double)(a+x+b+x)/(4+x);
        if (x == x);
        System.out.println("Y = " + Y);
    }
}

//y=(2x+5x)/4x