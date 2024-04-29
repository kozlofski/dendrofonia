import models.Tree;
import processing.core.PApplet;

public class Dendrofonia extends PApplet {
    Tree tree;
    @Override
    public void settings() {
        size(800, 800, P3D);
//        frameRate(1.0f); //fixme why frameRate not workin'
    }

    @Override
    public void setup() {
        this.tree = new Tree(this);
        tree.grow(2);
        System.out.println(tree);
    }

    @Override
    public void draw() {
        tree.draw();
    }

    public static void main(String[] args) {
        PApplet.main(new String[] {Dendrofonia.class.getName()});
    }
}
