public class Rectangle extends Forme {

    private int longueur = 5;
    private int largeur;

    public Rectangle() {
        this.largeur = 10;
        this.longueur = 5;
    }

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public Rectangle(int largeur, int longueur, int x, int y) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(3, 4);

        System.out.println(r);
        System.out.println(r2);
    }

    @Override
    public String toString() {
        return "Je suis un rectangle avec une longueur de : " + this.longueur + " et une largeur " + this.largeur + " le perimetre = " + this.getPerimetre();
    }

    public int getLongueur() {
        return this.longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getPerimetre() {
        return (this.largeur + this.longueur) * 2;
    }

    public String toHTMLCanvas() {
        String res = "ctx.fillRect(";
        res += this.getX() + ",";
        res += this.getY() + ",";
        res += this.largeur + ",";
        res += this.longueur + ");";
        return res;
    }
}
