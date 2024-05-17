import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> books;

    private Boolean isOnBlacklist;
    public Reader(String name) {
        this.name = name;
        this.isOnBlacklist = false;
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        this.books.add(b);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Boolean getOnBlacklist() {
        return isOnBlacklist;
    }

    public void setOnBlacklist(Boolean onBlacklist) {
        isOnBlacklist = onBlacklist;
    }
}
