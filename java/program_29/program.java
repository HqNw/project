import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("file.txt"))) {
            pw.println("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
