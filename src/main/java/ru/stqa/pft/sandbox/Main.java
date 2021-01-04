package main.ru.stqa.pft.sandbox;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Point a = new Point(-2.0,4.0);
        Point b = new Point (5.0,6.0);
        System.out.println(distance(a,b));;
        System.out.println(Point.distanse(a,b));
    }

    public static double distance(Point p1, Point p2){

        double a = Math.pow(p2.a - p1.a, 2);
        double b = Math.pow(p2.b - p1.b, 2);
        double Distance = Math.sqrt(a+b);

        return Distance;
    }


}
