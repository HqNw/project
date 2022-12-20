import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterExample {
  public static void main(String[] args) {
    try (PrintWriter pw = new PrintWriter(new FileWriter("file.txt"))) {
      pw.println("Hello, World!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
