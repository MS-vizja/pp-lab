public class Main {
        public static void main(String[] args) {
            Point center = new Point(0, 0);
        
            Circle circle = new Circle(center, 4.0);
        
        System.out.println("srodek kola(" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("promien kola= " + circle.getRadius());
        System.out.println("obwod kola=" + circle.calculatePerimeter());
        System.out.println("pole powierzchni kola=" + circle.getArea());
    }
}
