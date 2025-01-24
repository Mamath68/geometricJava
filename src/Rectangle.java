public class Rectangle extends AGeometricForm {

    private final int largeur;
    private int longueur = 5;

    public Rectangle() {
        this.largeur = 10;
    }

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(3, 4);

        System.out.println(r);
        System.out.println(r2);
    }


    public int getLargeur() {
        return this.largeur;
    }

    public int getLongueur() {
        return this.longueur;
    }

    public int getPerimetre() {
        return (this.getLargeur() + this.getLongueur()) * 2;
    }

    @Override
    public String toString() {
        return "\n Je suis un rectangle avec une longueur de : " + this.longueur + " et une largeur de " + this.largeur + ". Le périmètre est = " + this.getPerimetre();
    }

}
