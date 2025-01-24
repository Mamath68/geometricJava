import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dessin {

    private List<Forme> formes = new ArrayList<>();


    public Dessin() {
        formes.add(new Cercle(5));
    }

    public Dessin(Forme... formes) {
        this.formes.addAll(Arrays.asList(formes));
    }

    public Dessin(List<Forme> formes) {
        this.formes = formes;
    }

    public static void main(String[] args) {
        Dessin dessin = new Dessin(new Triangle(), new Rectangle(), new Rectangle(), new Cercle(6));
        System.out.println(dessin);
    }

    @Override
    public String toString() {
        return "Dessin{" + this.formes +
                '}';
    }
}
