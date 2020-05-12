package konrad.jezierski;

public class Main {

    public static void main(String[] args) {
        Linia linia = new Linia();
        Prostokat prostokat = new Prostokat();
        rysujUtil(30, 30, 40, 40, linia);
        rysujUtil(50, 50, 60, 60, prostokat);
    }

    private static void rysujUtil(int x1, int y1, int x2, int y2, Grafika g) {
        g.setPoczatek(x1, y1);
        g.setKoniec(x2, y2);
        g.rysuj();
    }
}
