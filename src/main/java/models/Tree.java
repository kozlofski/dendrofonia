package models;

import processing.core.PApplet;
import java.util.ArrayList;

import static models.Util.MAX_SEGMENTS;

public class Tree {
    PApplet pApplet;

    ArrayList<Branch> branches;
    Util util;
    int lastGrownBranch = 0;


    private int totalSegments = 0;

    public Tree(PApplet pApplet) {
        System.out.println(" === New Tree Initialised === ");
        branches = new ArrayList<Branch>();
        this.pApplet = pApplet;
        util = new Util(pApplet);
    }

    public void grow(int segmentsToGrow) {
        // this version is for testing purposes
        for (int i = 0; i < segmentsToGrow; i++) {
            grow();
        }
    }

    public void grow() {
        this.grow(null);
    }

    // it should have own iterator - instead of squirrels
    public void grow(Sound sound) {
        if (totalSegments >= MAX_SEGMENTS) return;
        // fixme "segments full exception"

        int nextGrowingBranch = findGrowable();
        if(nextGrowingBranch == -2) return;
        // fixme "branches full exception"

        if(nextGrowingBranch == -1) {
            // tree empty
            branches.add(new Branch()); // fixme add parameters
            lastGrownBranch = 0;
        } else {
            branches.get(nextGrowingBranch).grow(sound);
        }

        lastGrownBranch = nextGrowingBranch;
    }

    int findGrowable() {
        if (branches.isEmpty()) {
            System.out.println(" -f- tree empty");
            return -1;
        }
        int checkedBranch = lastGrownBranch + 1;

        int totalBranches = branches.size();
        for (int i = 0; i < totalBranches; i++) {
            if (checkedBranch == totalBranches) checkedBranch = 0;

            if(branches.get(checkedBranch).isGrowable()) {
                System.out.println(" -f- found branch: " + checkedBranch);
                return checkedBranch;
            } else {
                checkedBranch++;
            }
        }

        System.out.println(" -f- all branches full");
        return -2; // all branches full
    }

    @Override
    public String toString() {
        // fixme this is not working - branches not printed
        StringBuilder builder = new StringBuilder();
        builder.append("Tree:\n");
        builder.append("Total branches: ");
        builder.append(branches.size());

        for(Branch b : branches) {
//            System.out.println("Fuck " + b);
            builder.append(b.toString());
        }

        return builder.toString();
    }
}
