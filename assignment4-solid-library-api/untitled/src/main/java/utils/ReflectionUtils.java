
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static void inspect(Object obj) {
        Class<?> c = obj.getClass();

        System.out.println("Class: " + c.getName());

        for (Field f : c.getDeclaredFields()) {
            System.out.println("Field: " + f.getName());
        }

        for (Method m : c.getDeclaredMethods()) {
            System.out.println("Method: " + m.getName());
        }
    }
}

