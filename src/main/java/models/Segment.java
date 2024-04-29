package models;

public class Segment {
    Sound sound;
    private int branchNumber; // branch which this segment belongs to
    private boolean hasChildren; // if true, a new child branch can grow at it's base
}
