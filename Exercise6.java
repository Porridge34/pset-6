import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int prevnum = 1;
        int result = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            try {
                num = in.nextInt();
                if (num > 0 && num <= 92) {
                    break;
                }
            }
            catch (Exception e) {
                in.nextLine();
            }
        }
        for (int i = 0; i < num - 1; i++) {
            int temp = prevnum;
            prevnum = result;
            result = result + temp;
        }
        System.out.printf("%n%,d.%n", result);

        in.close();
    }
}