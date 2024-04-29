package models;

import java.util.ArrayList;

public class Branch {
    ArrayList<Segment> segments;
    private boolean reachedMaxLength = false;
    private int generation;

    public boolean isReachedMaxLength() {
        return reachedMaxLength;
    }
}
