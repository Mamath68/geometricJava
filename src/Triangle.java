public class Triangle extends AGeometricForm {

    private int cote = 10;

    public Triangle() {
    }

    public Triangle(int cote) {
        this.cote = cote;
    }

    public int getPerimetre() {
        return this.cote * 3;
    }

    @Override
    public String toString() {
        return "\n Triangle { " +
                "cote 1 = " + cote +
                ", cote 2 = " + cote +
                ", cote 3 = " + cote +
                " }. Le périmètre est = " + this.getPerimetre();
    }
}
