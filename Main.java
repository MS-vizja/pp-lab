public class Main {
    public static void main(String[] args) {

        Square square = new Square(5.0);


        System.out.println("dlugosc boku kwadratu " + square.getLength());
        System.out.println("pole kwadratu " + square.calculateArea());
        System.out.println("obwod kwadratu " + square.calculatePerimeter());
    }
}
