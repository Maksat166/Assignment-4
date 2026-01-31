
import java.util.List;

public interface CrudRepository<T> {
    void create(T t);
    T findById(int id);
    List<T> findAll();
    void update(T t);
    void delete(int id);
}
