
public class Magazine extends LibraryItem {

    public Magazine(int id, String name) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "MAGAZINE";
    }

    @Override
    public double getDailyFee() {
        return 1.0;
    }
}
