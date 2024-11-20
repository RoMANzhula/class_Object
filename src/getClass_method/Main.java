package getClass_method;

import finalize_method_DEPRECATED.Resource;

public class Main {

    public static void main(String[] args) {
        String str = "Hello!";
        Integer numI = 123;
        Double numD = 2.44;
        Resource resource = new Resource();

        System.out.println(str.getClass());         // class java.lang.String
        System.out.println(numI.getClass());        // class java.lang.Integer
        System.out.println(numD.getClass());        //class java.lang.Double
        System.out.println(resource.getClass());    //class finalize_method_DEPRECATED.Resource
    }

}
