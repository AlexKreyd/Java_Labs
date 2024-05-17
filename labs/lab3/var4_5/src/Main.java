import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();
        Reader reader_1 = new Reader("Иван");
        Librarian librarian_1 = new Librarian("Петр");

        Book book_1 = new Book("Война и мир", "Л. Н. Толстой", 1000, 1873);
        Book book_2 = new Book("Евгений Онегин", "А. С. Пушкин", 450, 1830);
        Book book_3 = new Book("Мертвые души", "Н. В. Гоголь", 500, 1835);

        HashSet<Book> books_catalog = new HashSet<Book>();
        books_catalog.add(book_1);
        books_catalog.add(book_2);
        library.setCatalog(books_catalog);

        librarian_1.issueBook(library, reader_1, book_1, true);
        librarian_1.issueBook(library, reader_1, book_3, true);

        System.out.println("Читатель " + reader_1.getName() + " в черном списке: " + reader_1.getOnBlacklist());

        System.out.println("Вернули ли читатель книгу?");
        String reader_return = scanner.nextLine();
        if (reader_return.equalsIgnoreCase("нет")) {
            librarian_1.addToBlackList(reader_1);
        }

        System.out.println("Читатель " + reader_1.getName() + " в черном списке: " + reader_1.getOnBlacklist());
    }
}