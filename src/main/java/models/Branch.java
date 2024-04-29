package models;

import java.util.ArrayList;

public class Branch {
    ArrayList<Segment> segments;
    private boolean reachedMaxLength = false;
    private int generation;
    private int branchNumber;

    public Branch(int branchNumber) {
        segments = new ArrayList<Segment>();
        this.branchNumber = branchNumber;
    }

    public boolean isGrowable() {
        return (!hasReachedMaxLength() && !hasReachedMaxSegments()); // fixme add conditions
    }

    private boolean hasReachedMaxLength() {
        return reachedMaxLength;
    }

    private boolean hasReachedMaxSegments() {
        return false;
    }


    public void grow(Sound sound) {
        if(isGrowable()) {
            // fixme unnecessary double condition check - where better? (Tree?)
            segments.add(new Segment(sound));
        }
    }

    @Override
    public String toString() {
        StringBuilder segmentsString = new StringBuilder();
        if(segments.isEmpty()) return "";

        for (Segment s : segments) {
            segmentsString.append(s.toString());
        }


        return "\n -b- Branch no " + branchNumber +
                " with segments:\n" + segmentsString.toString();
    }
}
