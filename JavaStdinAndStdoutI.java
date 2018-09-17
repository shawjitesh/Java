import java.util.Scanner;

public class JavaStdinAndStdoutI {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer");
        int a = scan.nextInt();
        System.out.println("Enter second integer");
        int b = scan.nextInt();
        System.out.println("Enter third integer");
        int c = scan.nextInt();

        scan.close();

        System.out.println("First integer: " + a);
        System.out.println("Second integer: " + b);
        System.out.println("Third integer: " + c);
    }
}
