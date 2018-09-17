import java.util.Scanner;

public class JavaStdinAndStdoutII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer");
        int i = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a double");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter a string");
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
