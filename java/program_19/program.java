import java.util.HashMap;

class HashMapExample {
  public static void main(String[] args) {
    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("one", 1);
    numbers.put("two", 2);
    numbers.put("three", 3);
    numbers.put("four", 4);
    numbers.put("five", 5);
    System.out.println(numbers.get("three"));
  }
}
