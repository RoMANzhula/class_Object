package clone_method;

// Create class that implements interface Cloneable
public class MyObject implements Cloneable {

    String name;
    int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "MyObject{name=" + name + ", age=" + age + "}";
    }
}
