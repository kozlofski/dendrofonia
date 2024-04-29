package models;

import processing.core.PApplet;
import java.util.ArrayList;

import static models.Util.MAX_SEGMENTS;

public class Tree {

    ArrayList<Branch> branches;
    Util util;
    PApplet pApplet;

    private int totalSegments = 0;

    void grow(int segments) {
        // this version is for testing purposes
        for (int i = 0; i < segments; i++) {
            grow();
        }
    }

    void grow() {
        this.grow(null);
    }

    // it should have own iterator - instead of squirrels
    void grow(Sound sound) {
        // write "tree full exception" and
        // brace this method with try/catch
        if(totalSegments >= MAX_SEGMENTS) return;

        for (int i = 0; i < branches.size(); i++) {

        }
    }

    public Tree(PApplet pApplet) {
        System.out.println(" === New Tree Initialised === ");
        branches = new ArrayList<Branch>();
        this.pApplet = pApplet;
        util = new Util(pApplet);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tree:");
        builder.append("Total branches: ");
        builder.append(branches.size());
        return builder.toString();
    }
}
