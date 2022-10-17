import java.util.Scanner;

/*
 C2 = 503 % 2 = 1     | O1 = "-"
 C = C3 = 503 % 3 = 2 | C = 2
 C5 = 503 % 5 = 3     | O2 = "+"
 C7 = 503 % 7 = 6     | double
*/
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        final int C = 2;
        double i, j;
        double a, n, b, m;

        a = UsersInput("Enter a");
        n = UsersInput("Enter n");
        b = UsersInput("Enter b");
        m = UsersInput("Enter m");


        if (a <= C) {
            System.out.println("Division by zero");
        } else {
            for (i = a; i < n; i++) {
                for (j = b; j < m; j++) {
                    sum += (i + j) / (i - C);
                }
            }
            System.out.println("Sum is " + sum);
        }
    }

    public static double UsersInput(String Message){
        double Num;
        Scanner sc = new Scanner(System.in);

        System.out.println(Message);
        if (sc.hasNextDouble()) {
            Num = sc.nextDouble();
            return Num;
        } else {
            System.out.println("Incorrect input");
            System.exit(0);
            return 0;
        }
    }
}
