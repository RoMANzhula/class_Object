package finalize_method_DEPRECATED;

public class Resource {

    //from Java 9 this method is deprecated, no recommend to use (it's better to use the AutoCloseable interface instead)

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being finalized.");
    }

}
