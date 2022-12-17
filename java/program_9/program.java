import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int i = 0;
        while (i < num) {
            System.out.println(i);
            i++;
        }
    }
}
