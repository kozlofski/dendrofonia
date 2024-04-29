package models;

public class Segment {
    Sound sound;
    private int branchNumber; // branch which this segment belongs to
    private boolean hasChildren; // if true, a new child branch can grow at it's base

    public Segment(Sound sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return " --s- " +
                "sound=" + sound +
                ", branchNumber=" + branchNumber +
                ", hasChildren=" + hasChildren +
                "\n";
    }
}
