public class Main {
public static void main(String[] args) {

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new ColoredCircle(new Point(0, 1), 3.0, "blue");
        circles[2] = new ColoredCircle(new Point(1, 1), 4.0, "red");

        for (Circle circle : circles) {
            double area = circle.getArea();
              System.out.println("pole powierzchni: " + area);
            
            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                  System.out.println("kolor kola: " + color);
            }
        }
    }
}
