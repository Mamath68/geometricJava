public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle + ", Mon périmètre est de: " + rectangle.getPerimetre());

        System.out.println(" ");

        Triangle triangle = new Triangle(5);
        System.out.println(triangle + ", Mon périmètre est de: " + triangle.getPerimetre());

        System.out.println(" ");

        Cercle cercle = new Cercle(5);
        System.out.println(cercle + ", Mon périmètre est de:" + cercle.getPerimetre());
    }
}
