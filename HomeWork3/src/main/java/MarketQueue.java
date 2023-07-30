import java.util.*;
public class MarketQueue implements iQueueBehavior {

    private Queue<Person> people;


    // Конструктор экземпляра MarketQueue
    MarketQueue() {
        people = new LinkedList<>();
    }


    @Override
    public void checkQueueStatus() {
        System.out.println("На данный момент в очереди " + people.size() + " человек");
    }


    @Override
    public void putPerson(Person person) {
        if (person != null) {
            people.add(person);
        } else {
            System.out.println("incorrectly");
        }
    }


    @Override
    public void removePerson(Person person) {
        if (person != null) {
            people.remove(person);
            checkQueueStatus();
        } else {
            System.out.println("incorrectly");
        }
    }
}