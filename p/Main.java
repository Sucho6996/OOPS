package p;

import p.p1.TwoDim;
import p.p2.ThreeDim;

public class Main {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        TwoDim obj;

        obj = new TwoDim(5, 10);
        System.out.println("TwoDim Object: " + obj);

        obj = new ThreeDim(5, 10, 15);
        System.out.println("ThreeDim Object: " + obj);
    }
}
