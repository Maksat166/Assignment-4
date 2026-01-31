
public abstract class LibraryItem {
    private int id;
    private String name;

    public LibraryItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getType();
    public abstract double getDailyFee();

    public String basicInfo() {
        return id + " - " + name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
