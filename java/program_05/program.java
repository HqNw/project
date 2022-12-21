class LogicalExample {
  public static void main(String[] args) {
    boolean flag1 = true;
    boolean flag2 = false;

    boolean and = flag1 && flag2;
    boolean or = flag1 || flag2;
    boolean not = !flag1;

    System.out.println("and: " + and);
    System.out.println("or: " + or);
    System.out.println("not: " + not);
  }
}
