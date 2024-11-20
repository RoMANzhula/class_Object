package equals_method;

import java.util.List;
import java.util.Objects;

public class Person {
    String name;
    int age;
    double weight;
    List<Object> family; //this field we are not use in the equals() method (to avoid loop loading)

    public Person(String name, int age, double weight, List<Object> family) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.family = family;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // checking same links
        if (obj == null || getClass() != obj.getClass()) return false; // checking null and types
        Person person = (Person) obj;

        return Objects.equals(name, person.name) &&  // safely comparison for null
                age == (person.age) &&
                Double.compare(person.weight, weight) == 0 //comparison with wrapper
        ;

    }

    // MUST REMEMBER - if we`re overriding equals() we ALWAYS need to override method hashCode()

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight); // generate hash-code
    }

}
