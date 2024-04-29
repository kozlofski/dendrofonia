import models.Tree;
import processing.core.PApplet;

public class Dendrofonia extends PApplet {
    Tree tree;
    @Override
    public void settings() {
        size(800, 800, P3D);
    }

    @Override
    public void setup() {
        this.tree = new Tree(this);
        tree.grow(1);
        System.out.println(tree);
    }

    @Override
    public void draw() {
    }

    public static void main(String[] args) {
        PApplet.main(new String[] {Dendrofonia.class.getName()});

    }
}
