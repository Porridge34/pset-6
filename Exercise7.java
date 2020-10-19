import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            try {
                num = in.nextInt();
                if (num > 0) {
                    break;
                }
            }
            catch (Exception e) {
                in.nextLine();
            }
        }
        System.out.println();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0 && i == 1) {
                System.out.printf("%d, %d", i, num/i);
            }
            else if (num % i == 0){
                System.out.printf(", %d, %d", i, num/i);
            }
        }
        System.out.println(".");

        in.close();
    }
}