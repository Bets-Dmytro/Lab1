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
        Scanner sc = new Scanner(System.in);

        // Input of a
        System.out.println("Enter a");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("Incorrect input");
            return;
        }

       // Input of n
        System.out.println("Enter n");
        if (sc.hasNextDouble()) {
            n = sc.nextDouble();
        } else {
            System.out.println("Incorrect input");
            return;
        }

        // Input of b
        System.out.println("Enter b");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else {
            System.out.println("Incorrect input");
            return;
        }

       // Input of m
        System.out.println("Enter m");
        if (sc.hasNextDouble()) {
            m = sc.nextDouble();
        } else {
            System.out.println("Incorrect input");
            return;
        }


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
}
