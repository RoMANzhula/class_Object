package finalize_method_DEPRECATED;

public class Main {

    public static void main(String[] args) {

        Resource resource = new Resource();

        resource = null; //kill reference to object from heap

        // call Garbage Collector
        System.gc();

    }

}
