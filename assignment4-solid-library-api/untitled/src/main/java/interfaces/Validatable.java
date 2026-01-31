
public interface Validatable<T> {
    boolean isValid(T t);

    default void validateOrThrow(T t) {
        if (!isValid(t)) {
            throw new IllegalArgumentException("Invalid data");
        }
    }

    static void log(String msg) {
        System.out.println("[VALIDATION] " + msg);
    }
}
