public class Rectangle extends AGeometricForm {
    private final int largeur, longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public int getPerimetre() {
        return 2 * (this.largeur + this.longueur);
    }

    @Override
    public String toString() {
        return "Je suis un rectangle de largeur " + this.largeur + " et de longueur " + this.longueur + ". Mon périmètre est de: " + this.getPerimetre();
    }

}
