import static java.lang.Math.PI;

public class Cercle extends AGeometricForm {
    private final int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public int getPerimetre() {
        return (int) (2 * PI * this.rayon);
    }

    @Override
    public String toString() {
        return "Je suis un cercle de rayon " + this.rayon + ". Mon périmètre est de: " + this.getPerimetre();
    }

}
