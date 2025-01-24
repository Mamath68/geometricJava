import static java.lang.Math.PI;

public class Cercle extends IGeometricForm {
    private final int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Je suis un cercle de rayon " + this.rayon;
    }

    public int getPerimetre() {
        return (int) (2 * PI * this.rayon);
    }

}
