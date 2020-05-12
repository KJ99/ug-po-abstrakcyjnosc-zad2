package konrad.jezierski;

public class Prostokat extends Grafika {
    @Override
    void rysuj() {
        System.out.printf("Rysuj Prostokat od (%d, %d) do (%d, %d) %n", x1, y1, x2, y2 );
    }
}
