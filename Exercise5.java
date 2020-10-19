import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            try {
                num = in.nextInt();
                if (num >= 0) {
                    break;
                }
            }
            catch (Exception e) {
                in.nextLine();
            }
        }
        if (num == 2) {
            System.out.printf("%nPrime.%n");
            System.exit(0);
        }
        for (int i = 2; i < num/2 + 1; i++) {
            if (num % i == 0) {
                System.out.printf("%nNot prime.%n");
                System.exit(0);
            }
        }
        System.out.printf("%nPrime.%n");

        in.close();
    }
}