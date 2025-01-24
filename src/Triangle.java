public class Triangle extends IGeometricForm {

    private final int cote;

    public Triangle(int cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Je suis un triangle isocèle: " +
                "cote 1: " + this.cote + " cote 2: " + this.cote + " cote 3: " + this.cote;
    }

    @Override
    public int getPerimetre() {
        return (this.cote + this.cote + this.cote);
    }
}
