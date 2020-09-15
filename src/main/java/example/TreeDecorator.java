package example;

public abstract class TreeDecorator implements ChristmasTree {
    ChristmasTree christmasTree;


    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
