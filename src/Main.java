public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10, 20);

        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle(5);

        Cercle cercle = new Cercle();
        Cercle cercle2 = new Cercle(5);


        System.out.println(rectangle);
        System.out.println(rectangle2);
        System.out.println(triangle);
        System.out.println(triangle2);
        System.out.println(cercle);
        System.out.println(cercle2);

    }
}
