package p.p2;

import p.p1.TwoDim; // Import TwoDim class

public class ThreeDim extends TwoDim {
    private int z;

    // Default constructor
    public ThreeDim() {
        super();
        z = 0;
    }

    // Parameterized constructor
    public ThreeDim(int x, int y, int z) {
        super(x, y); // Call TwoDim's constructor
        this.z = z;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + ", z = " + z;
    }
}
