import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        int lower = 0;
        int upper = 0;
        while (true) {
            System.out.print("Lower bound: ");
            lower = in.nextInt();
            System.out.print("Upper bound: ");
            upper = in.nextInt();
            if (lower <= upper) {
                break;
            }
        }
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("%n%,d.%n", sum);

        in.close();
    }
}