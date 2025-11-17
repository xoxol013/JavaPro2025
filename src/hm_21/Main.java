package hm_21;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        ArrayUtils utils = new ArrayUtils();
        utils.sum(5,7);
        utils.multiply(7,9);
        System.out.println("   Methods info   ");

        for (Method method : ArrayUtils.class.getDeclaredMethods()) {

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo info = method.getAnnotation(MethodInfo.class);
                System.out.println("Method name: " + info.name());
                System.out.println("Return type: " + info.returnType());
                System.out.println("Description: " + info.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Author " + author.firstName() + " " + author.lastName());
            }

            System.out.println("--------------------");
        }
    }
}
