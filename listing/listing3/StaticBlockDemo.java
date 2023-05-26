package ru.vshp.listing3;

public class StaticBlockDemo {
    static double rootOF9;
    static double rootOF27;
    int number;
    static {
        System.out.println("Инициализация статических членов класса....");
        rootOF9 = Math.sqrt(9.0);
        rootOF27 = Math.sqrt(27.0);
    }
 StaticBlockDemo(int number) {
    System.out.println("Инициализация статических членов класса....");
    this.number = number;
 }
}
public class StaticBlockDemo {
  public static void main(String[] args) {
      System.out.println("Корень из 9 равен " + StaticBlockDemo.rootOF9);
      System.out.println("Корень из 27 равен " + StaticBlockDemo.rootOF27);

      StaticBlockDemo sb1 = new StaticBlockDemo(4);
      System.out.println("sb1.number = " + sb1.number);

      StaticBlockDemo sb2 = new StaticBlockDemo(16);
      System.out.println("sb2.number = " + sb2.number);
  }
}