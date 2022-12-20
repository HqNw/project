import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamExample {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("file.txt")) {
      int data = fis.read();
      while (data != -1) {
        System.out.print((char)data);
        data = fis.read();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
