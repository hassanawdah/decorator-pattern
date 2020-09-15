package example;

public class ExtraClass extends TreeDecorator {
    public ExtraClass(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return super.decorate() + getString();
    }

    private String getString() {
        return " get String method ";
    }
}
