package factory;

public class TurkishCoffeeStore extends CoffeeStore {
    @Override
    protected Coffee createCoffee() {

        return new TurkishCoffee("Turkish coffee", 32, "Small");
    }
}
