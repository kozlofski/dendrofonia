package models;

import processing.core.PApplet;
import processing.core.PMatrix3D;

public final class Util {
    public static final int MAX_GENERATIONS = 7;
    public static final int MAX_SEGMENTS = 10_000;
    public static PMatrix3D rootMatrix;
    private final PApplet pApplet;

    public Util(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    void init() {
        rootMatrix.translate(pApplet.width/2.0f, pApplet.height, 0.0f);
        rootMatrix.rotateZ((float)Math.toRadians(-90.0));
    }
}
