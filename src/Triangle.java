public class Triangle extends Forme {

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
        return "\n Je suis un Triangle avec des cotes qui sont les suivantes : " +
                "Cote 1: " + cote +
                ", Cote 2: " + cote +
                ", Cote 3: " + cote +
                ". Le périmètre est " + this.getPerimetre();
    }
}
