public interface PersonBuilder {
    PersonBuilder setFirstName(String firstName);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setAge(int age);
    PersonBuilder setAddress(String address);

    Person build();
}
