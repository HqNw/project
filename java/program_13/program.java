import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if (i == num) {
                continue;
            }
            System.out.println(i);
        }
    }
}

