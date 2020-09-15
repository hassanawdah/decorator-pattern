package example;

public class Main {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImplementation();
        System.out.println(christmasTree.decorate());
        christmasTree = new BubbleLights(christmasTree);
        System.out.println(christmasTree.decorate());

        christmasTree = new ExtraClass(christmasTree);
        System.out.println(christmasTree.decorate());


    }
}
