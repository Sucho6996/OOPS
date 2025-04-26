package p.p1;

public class TwoDim {
    private int x, y;

    // Default constructor
    public TwoDim() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override toString
    @Override
    public String toString() {
        return "Coordinates: (" + x + ", " + y + ")";
    }
}
