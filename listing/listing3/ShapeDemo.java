package ru.vshp.listing3;

abstract class ShapeDemo {
    abstract double area();

    double area() {
        return ((radius * radius) * 3.14);
    }
}
class Point extends ShapeDemo {
    public String toString() {return "Точка";}
    double area() {return "Точка";}
}
class Point extends ShapeDemo {
    int cathetus1 = cathetus1;
    int cathetus2 = cathetus2;
    Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }
    public String toString() {return "Треугольник";}
    double area() {
        return ((cathetus1 * cathetus2) / 2.0);
    }
}
class Circle extends ShapeDemo {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Круг";
    }

    double area() {
        return ((radius * radius) * 3.14);
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Point p = new Point()();
        Triangle t = new Triangle(5, 3);
        Circle C = new Circle(9);
        ShapeDemo[] s = {p, t, c};

        System.out.println("Расчет площади фигур");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString() + " :" + s[i].area());
        }
    }
}

