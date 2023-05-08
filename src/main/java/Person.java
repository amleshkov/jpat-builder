public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age.equals(null)) throw new IllegalArgumentException("Возраст не задан");
        age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilderImpl().setLastName(lastName).setAge(0).setAddress(address);
    }

    @Override
    public String toString() {
        return "Имя: " + firstName +
                " Фамилия: " + lastName +
                " Возраст: " + (hasAge() ? age : "не задан") +
                " Адрес: " + (hasAddress() ? address : "не задан");
    }
}
