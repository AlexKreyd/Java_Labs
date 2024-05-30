public class Book {
    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int year_publication;
    private int page_number;
    private float price;
    private String cover_type;

    public Book(int id, String title, String[] authors, String publisher, int year_publication,
                int page_number, float price, String cover_type) throws BookInitializationException {
        validateInitialization(id, title, authors, publisher, year_publication,
                    page_number, price, cover_type);
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year_publication = year_publication;
        this.page_number = page_number;
        this.price = price;
        this.cover_type = cover_type;

    }

    @Override
    public String toString() {
        return "Книга: '" + this.title + "', " + String.join(", ", this.authors) +
                ", изд." + this.publisher + ", " + this.year_publication + "г., " + this.page_number +
                " стр., переплет: " + this.cover_type + ", " + this.price + " руб.";
    }

    public static void validateInitialization(int id, String title, String[] authors,
                                              String publisher, int year_publication,
                                              int page_number, float price,
                                              String cover_type)throws BookInitializationException {
        validateId(id);
        validateTitle(title);
        validateAuthors(authors);
        validatePublisher(publisher);
        validateYearPublication(year_publication);
        validatePageNumber(page_number);
        validatePrice(price);
        validateCoverType(cover_type);
    }

    public static void validateId(int id) throws BookInitializationException {
        if (id <=0) {
            throw new BookInitializationException("Id должно быть больше нуля");
        }
    }

    public static void validateTitle(String title) throws BookInitializationException {
        if (title.equals("")) {
            throw new BookInitializationException("Название книги не должно быть пустой строкой");
        }
    }

    public static void validateAuthors(String[] authors) throws BookInitializationException {
        for (String author: authors) {
            if (author.equals("")) {
                throw new BookInitializationException("Имя автора не должно быть пустой строкой");
            }
        }
    }

    public static void validatePublisher(String publisher) throws BookInitializationException {
        if (publisher.equals("")) {
            throw new BookInitializationException("Название издателя не должно быть пустой строкой");
        }
    }

    public static void validateYearPublication(int year_publication) throws BookInitializationException {
        if (year_publication <=0) {
            throw new BookInitializationException("Год написания книги должен быть больше нуля");
        }
    }

    public static void validatePageNumber(int page_number) throws BookInitializationException {
        if (page_number <=0) {
            throw new BookInitializationException("Количество страниц у книги должно быть больше нуля");
        }
    }

    public static void validatePrice(float price) throws BookInitializationException {
        if (price <=0) {
            throw new BookInitializationException("Цена у книги должна быть больше нуля");
        }
    }

    public static void validateCoverType(String cover_type) throws BookInitializationException {
        if (cover_type.equals("")) {
            throw new BookInitializationException("Название типа перплета книги не должно быть пустой строкой");
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return this.title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear_publication() {
        return year_publication;
    }

    public int getPage_number() {
        return page_number;
    }

    public float getPrice() {
        return price;
    }

    public String getCover_type() {
        return cover_type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear_publication(int year_publication) {
        this.year_publication = year_publication;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCover_type(String cover_type) {
        this.cover_type = cover_type;
    }

}
