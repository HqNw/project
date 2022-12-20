import java.util.Scanner;

class ScannerExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter something: ");
    String input = scanner.nextLine();
    System.out.println("You entered: " + input);
  }
}
