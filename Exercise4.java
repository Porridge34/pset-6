import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int tempnum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            tempnum = in.nextInt();
            //ask teacher about this
            if (tempnum >= 0) {
                sum += tempnum;
                count++;
            }
            else {
                double avg = (double) sum / count;
                if (Double.isNaN(avg)) {
                    System.out.printf("%nError: division by zero.%n");
                    break;
                }
                System.out.printf("%n%,.2f%n", avg);
                break;
            }
        }

        in.close();
    }
}