package example;

public class BubbleLights extends TreeDecorator {


    public BubbleLights(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " Buuble Light ";
    }
}
