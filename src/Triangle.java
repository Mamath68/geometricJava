public class Triangle extends AGeometricForm {

    private final int cote;

    public Triangle(int cote) {
        this.cote = cote;
    }

    @Override
    public int getPerimetre() {
        return (this.cote + this.cote + this.cote);
    }

    @Override
    public String toString() {
        return "Je suis un triangle isocèle: " +
                "cote 1: " + this.cote + " cote 2: " + this.cote + " cote 3: " + this.cote+ ". Mon périmètre est de: " + this.getPerimetre();
    }
}
