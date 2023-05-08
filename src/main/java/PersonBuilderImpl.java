public class PersonBuilderImpl implements PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    @Override
    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть отрицательным");
        this.age = age;
        return this;
    }
    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    @Override
    public Person build() {
        Person person = initialBuild();
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }

    private Person initialBuild() {
        if (firstName == null || firstName.isEmpty()) throw  new IllegalStateException("Имя не задано");
        if (lastName == null || lastName.isEmpty()) throw new IllegalStateException("Фамилия не задана");
        if (age == null) {
            return new Person(firstName, lastName);
        } else {
            return new Person(firstName, lastName, age);
        }
    }
}
