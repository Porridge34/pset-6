import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 0;
        while (true) {
            System.out.print("Height: ");
            try {
                height = in.nextInt();
                if (height > 0 && height < 25) {
                    break;
                }
            }
            catch (Exception e) {
                in.nextLine();
            }
        }

        System.out.println();

        for (int i = 0; i < height; i++) {
            for (int j = i + 1; j < height; j++) {
                System.out.print(" ");
            }
            for (int j = height - i - 2; j < height; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        in.close();
    }
}