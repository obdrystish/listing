package ru.vshp.listing3;

public class ParaByRefDemo {
    int x, y;

    ParaByRefDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Void callByRefDemo(ParaByRefDemo o) {
        o.x = o.x + this.x;
        o.x = o.x + yhis.y;
    }
}
class Parabyrefdemo {
    public static void main(String[] args) {
        ParaByRefDemo p = new ParaByRefDemo(2,3);
        Parabyrefdemo q = new Parabyrefdemo(3, 2);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        p.callByRefDemo(q);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);
    }
}
}
