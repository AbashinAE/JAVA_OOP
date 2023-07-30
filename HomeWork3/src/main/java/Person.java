public class Person {
    private String firstname;
    private String lastname;


    public Person(String firstname, String lastname) {
        if (firstname == null || lastname == null || firstname.trim().isEmpty() || lastname.trim().isEmpty()) {
            throw new IllegalArgumentException("incorrectly (не введены данные) ");
        }
        this.firstname = firstname.trim();
        this.lastname = lastname.trim();
    }


    @Override
    public String toString() {
        StringBuilder strbild = new StringBuilder();
        strbild.append(firstname);
        strbild.append(" ");
        strbild.append(lastname);
        return strbild.toString();
    }
}
