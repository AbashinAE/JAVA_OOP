package Task1;

public class OwnersAndCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Tom");
        cat1.setAge(5);
        cat1.setOwnerName("Bob");
        System.out.println(cat1.greetings());

    }
}
