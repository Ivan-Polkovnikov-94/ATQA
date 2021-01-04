package main.ru.stqa.pft.sandbox;

public class Point {

    public double a;
    public double b;

    public Point (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double distanse (Point p1, Point p2){
        double a = Math.pow(p2.a - p1.a, 2);
        double b = Math.pow(p2.b - p1.b, 2);
        double d = Math.sqrt(a+b);
        return d;
    }

}
