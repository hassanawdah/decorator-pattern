package factory;

public class AmericanCoffeeStore extends CoffeeStore {
    @Override
    protected Coffee createCoffee() {
        return new AmericanCoffee("American Coffee ", 22, " coffee");
    }
}
