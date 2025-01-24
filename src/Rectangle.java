public class Rectangle extends IGeometricForm {
    private final int largeur, longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Je suis un rectangle de largeur " + this.largeur + " et de longueur " + this.longueur;
    }

    @Override
    public int getPerimetre() {
        return (2 * (this.largeur + this.longueur));
    }
}
