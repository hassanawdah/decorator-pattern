package factory;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new AmericanCoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());
        System.out.println(coffee.getDescription());
    }


}
