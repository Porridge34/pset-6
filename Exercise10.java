import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter credit card number: ");

        long creditNum = in.nextLong();
        int creditLen = String.valueOf(creditNum).length();
        long tempCreditNum = creditNum;
        int every_other_sum = 0;
        int product_sum = 0;

        for (int i = 0; i < creditLen; i++) {
            int last_digit = (int) (tempCreditNum % 10);
            if (i % 2 == 0) {
                every_other_sum += last_digit;
            } else {
                int temp = last_digit * 2;
                int x = temp % 10;
                int y = temp / 10;
                product_sum += x + y;
            }
            tempCreditNum /= 10;
        }

        int final_sum = every_other_sum + product_sum;

        if (final_sum % 10 == 0) {
            String temp = String.valueOf(creditNum);
            if (temp.substring(0, 2).equals("34")|| temp.substring(0, 2).equals("37")) {
                System.out.printf("%nAmerican Express.%n");
            }
            else if (Integer.parseInt(temp.substring(0, 2)) >= 51 &&
                    Integer.parseInt(temp.substring(0, 2)) <=55) {
                System.out.printf("%nMastercard.%n");
            }
            else if (temp.substring(0, 1).equals("4")) {
                System.out.printf("%nVisa.%n");
            }
            else {
                System.out.printf("%nInvalid.%n");
            }
        }
        else {
            System.out.printf("%nInvalid.%n");
        }

        in.close();
    }
}