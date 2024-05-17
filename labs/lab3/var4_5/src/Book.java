import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int page_num;
    private int creation_year;

    public Book(String title, String author, int page_num, int creation_year) {
        this.title = title;
        this.author = author;
        this.page_num = page_num;
        this.creation_year = creation_year;
    }

    @Override
    public String toString() {
        return "Книга '" + this.title + "', автора: " +
                this.author + ", " + this.creation_year + " г., " +
                this.page_num + " стр.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.page_num, this.creation_year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book other = (Book) o;
        return this.title.equals(other.title) && this.author.equals(other.author) &&
                this.page_num == other.page_num && this.creation_year == other.creation_year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage_num() {
        return page_num;
    }

    public void setPage_num(int page_num) {
        this.page_num = page_num;
    }

    public int getCreation_year() {
        return creation_year;
    }

    public void setCreation_year(int creation_year) {
        this.creation_year = creation_year;
    }
}
