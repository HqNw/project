class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() { return name; }

  public int getAge() { return age; }
}

class ClassExample {
  public static void main(String[] args) {
    Person person = new Person("John", 30);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
  }
}
