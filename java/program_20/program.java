class Animal {
  protected String name;

  public Animal(String name) { this.name = name; }

  public String getName() { return name; }
}

class Dog extends Animal {
  public Dog(String name) { super(name); }

  public void bark() { System.out.println(name + " is barking."); }
}

class InheritanceExample {
  public static void main(String[] args) {
    Dog dog = new Dog("Max");
    System.out.println(dog.getName());
    dog.bark();
  }
}
