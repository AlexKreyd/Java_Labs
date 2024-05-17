import java.util.*;

public class Library {
    private HashSet<Book> catalog;
    List<Reader> readers;

    public Library() {
        this.catalog = new HashSet<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book new_book) {
        this.catalog.add(new_book);
    }
    public HashSet<Book> getCatalog() {
        return catalog;
    }

    public Boolean checkBook(Book book) {
        return this.catalog.contains(book);
    }

    public void setCatalog(HashSet<Book> catalog) {
        this.catalog = catalog;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }
}
