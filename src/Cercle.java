import static java.lang.Math.PI;

public class Cercle extends Forme {

    private int rayon = 10;

    public Cercle() {
    }

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    public int getPerimetre() {
        return (int) (this.rayon * 2 * PI);
    }

    @Override
    public String toString() {
        return "\n Cercle{" +
                "Mon rayon est = " + this.rayon +
                " }. Le périmètre est = " + this.getPerimetre();
    }
}
