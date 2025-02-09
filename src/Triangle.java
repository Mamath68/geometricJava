public class Triangle extends Forme {

    private int cote = 10;

    public Triangle() {
    }

    public Triangle(int cote) {
        this.cote = cote;
    }

    public Triangle(int cote, int x, int y) {
        super(x, y);
        this.cote = cote;
    }

    public int getPerimetre() {
        return this.cote * 3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "cote1=" + cote +
                "cote2=" + cote +
                "cote3=" + cote +
                '}';
    }

    public String toHTMLCanvas() {
        return "ctx.fillRect(" + this.getX() + "," + this.getY() + "," + this.cote + ");";
    }
}
