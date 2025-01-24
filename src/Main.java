/*import java.text.Normalizer;*/

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(100, 1000);
        Rectangle rectangle2 = new Rectangle(10, 20);
        Rectangle rectangle3 = new Rectangle(1020, 1000);
        Rectangle rectangle4 = new Rectangle(1040, 1000);
        Rectangle rectangle5 = new Rectangle(1500, 1000);
        Triangle triangle = new Triangle();
        Cercle circle = new Cercle();

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(rectangle2);

        System.out.println(triangle.getPerimetre());
        System.out.println(rectangle.getPerimetre());
        System.out.println(circle.getPerimetre());

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);


        Forme circle2;
        circle2 = new Cercle();
        System.out.println(circle2.getPerimetre());
        circle2 = new Rectangle();
        System.out.println(circle2.getPerimetre());
        circle2 = new Triangle();
        System.out.println(circle2.getPerimetre());

        rectangle.setLongueur(999999);
        System.out.println(rectangle);
        circle2 = rectangle;
        System.out.println(circle2.getPerimetre());

        System.out.println("----------------------\nPositions\n----------------------");
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
        rectangle.translate(5, 500);
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());

        rectangle.setX(999);
        System.out.println(rectangle.getX());

        Cercle cercle2 = new Cercle(5, 1, 2);

        System.out.println("----------------------\ntoHTML\n----------------------");
        System.out.println("rectangle : ");
        System.out.println(new Rectangle().toHTMLCanvas());

        System.out.println("cercle : ");
        System.out.println(new Cercle().toHTMLCanvas());

        System.out.println("triangle : ");
        System.out.println(new Triangle().toHTMLCanvas());
    }
}
