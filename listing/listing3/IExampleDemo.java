package ru.vshp.listing3;

interface A {
    void metodA();
}
interface B extends A {
    void metodB();
}

public class IExampleDemo implements B {
    public void metodA() {System.out.println("Метода A");}
    public void metodB() {System.out.println("Метод B");}
}
public class IExampleDemo {
    public static void main(String[] args) {
        IExampleDemo ie = new IExampleDemo();
        ie.metodA();;
        ie.metodB();
    }
}