package toString_method;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Bob", "Sponge", 22, "123-456-7890");

        // we can call print person without .toString()
        System.out.println(person.toString()); //Person{name='Bob', surname='Sponge', age=22, phoneNumber='123-456-7890'}
    }

}
