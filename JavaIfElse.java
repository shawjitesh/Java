import java.util.Scanner;

public class JavaIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        String ans = "";

        sc.close();

        if(n >= 1 && n <= 100) {
            if(n % 2 != 0) {
                ans = "Weird";
            } else {
                if(n >= 2 && n <= 5) {
                    ans = "Not Weird";
                } else if(n >= 6 && n <= 20) {
                    ans = "Weird";
                } else if(n > 20) {
                    ans = "Not Weird";
                }
            }

            System.out.println(ans);
        }
    }
}