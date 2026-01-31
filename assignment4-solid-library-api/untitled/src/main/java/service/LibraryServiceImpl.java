
import java.util.Comparator;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    private CrudRepository<LibraryItem> repository;

    public LibraryServiceImpl(CrudRepository<LibraryItem> repository) {
        this.repository = repository;
    }

    @Override
    public void addItem(LibraryItem item) {
        repository.create(item);
    }

    @Override
    public List<LibraryItem> getAll() {
        List<LibraryItem> list = repository.findAll();

        // Lambda sorting
        list.sort(Comparator.comparing(LibraryItem::getName));
        return list;
    }
}

