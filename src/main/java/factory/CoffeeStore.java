package factory;

public abstract class CoffeeStore {

    public Coffee orderCoffee() {
        Coffee coffee = createCoffee();
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());
        System.out.println(coffee.getDescription());

        return coffee;
    }

    protected abstract Coffee createCoffee();
}
