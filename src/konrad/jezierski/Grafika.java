package konrad.jezierski;

public abstract class Grafika {
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;

    public void setPoczatek(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public void setKoniec(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    abstract void rysuj();
}
