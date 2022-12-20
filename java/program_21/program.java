interface Shape {
  double getArea();
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) { this.radius = radius; }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
}

class InterfaceExample {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    System.out.println(circle.getArea());
  }
}
