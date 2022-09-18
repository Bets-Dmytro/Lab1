/*
 C2 = 503 % 2 = 1     | O1 = "-"
 C = C3 = 503 % 3 = 2 | C = 2
 C5 = 503 % 5 = 3     | O2 = "+"
 C7 = 503 % 7 = 6     | double
*/
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int C = 2;
        double i, j;
        double a = 2, n = 7, b = 1, m = 48;

        for (i = a; i < n; i++)
            for (j = b; j < m; j++) {
                if (i == C) continue;

                sum += (i + j) / (i - C);
            }
        System.out.println(sum);
    }
}
