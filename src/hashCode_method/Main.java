package hashCode_method;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = new String("Hello");

        // In the String hashCode based on the symbols of the string (hashCode=ch[0]⋅31(n−1 degree) + ch[1]⋅31(n−2 degree) +⋯+ ch[n−1 degree])
        System.out.println(str1.hashCode()); // 69609650
        System.out.println(str2.hashCode()); // 69609650
        System.out.println(str3.hashCode()); // 69609650

        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = "Hello";

        // Objects have different hash-codes because they created in different objects` addresses in the memory (or value that present this address)
        System.out.println(object1.hashCode()); // 1595428806
        System.out.println(object2.hashCode()); // 1072408673
        System.out.println(object3.hashCode()); // 69609650
    }

}
