public class Main {
    public static void main(String[] args) {
        Category c = new Category(1, "Programming");

        LibraryItem book = new Book(1, "Clean Code", c);
        LibraryItem mag = new Magazine(2, "Java Weekly");

        ReflectionUtils.inspect(book);
    }
}
