import java.util.ArrayList;

class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    for (int num : numbers) {
      System.out.println(num);
    }
  }
}
