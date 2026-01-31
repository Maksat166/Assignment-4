
public class LibraryController {

    private LibraryService service;

    public LibraryController(LibraryService service) {
        this.service = service;
    }

    public void create(LibraryItem item) {
        service.addItem(item);
    }
}
