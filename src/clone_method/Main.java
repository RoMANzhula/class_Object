package clone_method;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject object1 = new MyObject("Bob", 20);
        MyObject object2 = (MyObject) object1.clone();

        System.out.println("Object #1 is: " + object1);                         // output: MyObject{name=Bob, age=20}

        System.out.println("Object #2 is a clone of Object #1: " + object2);    // output: MyObject{name=Bob, age=20}
    }

}
