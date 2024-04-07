public class Main {
    public static void main(String[] args) {

        Point center = new Point(0, 0);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "blue");
        
        System.out.println("srodek kola=(" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("promien kola= " + coloredCircle.getRadius());
        System.out.println("kolor kola" + coloredCircle.getColor());
        System.out.println("obwod kola= " + coloredCircle.calculatePerimeter());
        System.out.println("pole powierzchni kola=" + coloredCircle.getArea());
    }
}
