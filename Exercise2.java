import java.util.Scanner;

public class Exercise2 {
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
        String number = String.valueOf(num);
        for (int i = 0; i < number.length() - 1; i++) {
            System.out.printf("%s, ", number.charAt(number.length() - 1 - i));
        }
        System.out.printf("%s.%n", number.charAt(0));

        in.close();
    }
}