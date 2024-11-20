package equals_method;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> family1 = new ArrayList<>();
        family1.add("Father");
        family1.add("Mother");

        List<Object> family2 = new ArrayList<>();
        family1.add("Father");
        family1.add("Mother");

        Person person1 = new Person("Fernando", 30, 90.5, family1);
        Person person2 = new Person("Fernando", 30, 90.5, family2);
        Person person3 = new Person("Bob", 55, 110.5, null);

        // here we`re using our override method equals() from Person class
        System.out.println(person1.equals(person2));                            // true
        System.out.println(person1 == person2);                                 // false
        System.out.println(person1.equals(person3));                            // false
        // checking contract between equals() and hashCode()
        System.out.println(person1.hashCode() == person2.hashCode());           // true
        System.out.println(person1.hashCode() == person3.hashCode());           // false

        // notes
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = str1;

        System.out.println("=== Strings ===");
        System.out.println("Links (==): " + (str1 == str2));                    // false
        System.out.println("Links (==): " + (str1 == str3));                    // false
        System.out.println("Links (==): " + (str2 == str4));                    // false
        System.out.println("Values (equals): " + str1.equals(str2));            // true
        System.out.println("Values (equals): " + str1.equals(str3));            // true
        System.out.println("Values (equals): " + str2.equals(str4));            // true

        System.out.println("=== Objects ===");
        System.out.println("Links (==): " + (person1 == person2));              // false
        System.out.println("Values (equals): " + person1.equals(person2));      // true
        Person person4 = person1;
        System.out.println("The same links (==): " + (person1 == person4));     // true
    }

}
