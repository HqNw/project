import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file.txt")) {
            String str = "Hello, World!";
            fos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
