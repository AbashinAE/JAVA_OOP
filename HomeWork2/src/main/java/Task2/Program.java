package Task2;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bob";

        Market market = new Market();

        market.acceptToMarket(person1);
        market.takeInQueue(person1);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(person1);
        market.update();

    }
}

