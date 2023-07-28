package Task1;

public class Cat {
    private String name;
    private int age;

    private String owner;

    Owner catowner = new Owner();

    public String setName (String name) {
        return this.name = name;
    }

    public int setAge (int age) {
        return this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public String setOwnerName (String owner) {
        return catowner.setName(owner);
    }

    public String getOwnerName () {
        return catowner.getName();
    }

    public String greetings () {
        return ("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года (лет)"+ ". Мой владелец " + getOwnerName());
    }
}
