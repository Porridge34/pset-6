import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
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

        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (temp % 2 == 1) {
                sum += temp;
            }
        }

        System.out.printf("%n%,d.%n", sum);

        in.close();
    }
}