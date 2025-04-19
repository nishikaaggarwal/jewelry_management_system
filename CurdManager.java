import java.util.ArrayList;
import java.util.List;

public class CrudManager<T extends Jewelry> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    public void list() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
            return;
        }
        for (T item : items) {
            System.out.println(item);
        }
    }

    public T findById(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void update(int id, String newName, double newPrice, String newType) {
        T item = findById(id);
        if (item != null) {
            item.setName(newName);
            item.setPrice(newPrice);
            item.setType(newType);
            System.out.println("Item updated successfully!");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void delete(int id) {
        T item = findById(id);
        if (item != null) {
            items.remove(item);
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Item not found.");
        }
    }
}
