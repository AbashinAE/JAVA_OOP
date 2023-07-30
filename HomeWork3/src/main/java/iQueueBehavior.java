public interface iQueueBehavior {

    void checkQueueStatus();
    void putPerson(Person person);
    void removePerson(Person person);

}
