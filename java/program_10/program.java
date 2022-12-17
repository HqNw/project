import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < num);
    }
}
