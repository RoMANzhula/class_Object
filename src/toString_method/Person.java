package toString_method;

public class Person {

    String name;
    String surname;
    int age;
    String phoneNumber;

    public Person(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}'
        ;

    }
}
