import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book(0, "Энциклопедия", new String[]{"Иванов"}, "Издательство1",
                    2003, 350, 1000, "Твердый"));
            books.add(new Book(1, "Учебник математики", new String[]{"Петров", "Иванов"}, "Издательство2",
                    2007, 200, 570, "Твердый"));
            books.add(new Book(2, "Детектив", new String[]{"Конан Дойл"}, "Издательство1",
                    2010, -167, 400, "Мягкий"));
            books.add(new Book(-3, "Словарь", new String[]{"Петров"}, "Издательство3",
                    2001, 300, 250, "Мягкий"));

            Scanner scan = new Scanner(System.in);
            // вывод книг заданного автора
            System.out.println("Введите имя автора:");
            String author = scan.nextLine();
            ArrayList<Book> filtered_author_books = filter_by_author(books, author);
            if (filtered_author_books.size() == 0) {
                System.out.println("Книг заданного автора нет");
            } else {
                for (Book b : filtered_author_books) {
                    System.out.println(b.toString());
                }
            }

            // вывод книг заданного издательства
            System.out.println("Введите название издательства:");
            String publisher = scan.nextLine();
            ArrayList<Book> filtered_publisher_books = filter_by_publisher(books, publisher);
            if (filtered_publisher_books.size() == 0) {
                System.out.println("Книг, выпущенных заданным издательством, нет");
            } else {
                for (Book b : filtered_publisher_books) {
                    System.out.println(b.toString());
                }
            }

            // вывод книг, выпущенных после заданного года
            System.out.println("Введите минимальный год выпуска");
            int year = scan.nextInt();
            ArrayList<Book> filtered_year_books = filter_by_year(books, year);
            if (filtered_author_books.size() == 0) {
                System.out.println("Книг, выпущенных после заданного года, нет");
            } else {
                for (Book b : filtered_year_books) {
                    System.out.println(b.toString());
                }
            }
        } catch (BookInitializationException e) {
            System.out.println("Ошибка инициализации: " + e.getMessage());
        }
    }

    public static ArrayList<Book> filter_by_author(ArrayList<Book> books, String author) {
        ArrayList<Book> filtered_books = new ArrayList<>();
        for(Book book: books) {
            boolean found_author = false;
            for(String auth: book.getAuthors()) {
                if(auth.equals(author)) {
                    found_author = true;
                    break;
                }
            }
            if(found_author) {
                filtered_books.add(book);
            }
        }
        return filtered_books;
    }

    public static ArrayList<Book> filter_by_publisher(ArrayList<Book> books, String publisher) {
        ArrayList<Book> filtered_books = new ArrayList<>();
        for(Book book: books) {
            if(book.getPublisher().equals(publisher)) {
                filtered_books.add(book);
            }
        }
        return filtered_books;
    }

    public static ArrayList<Book> filter_by_year(ArrayList<Book> books, int year) {
        ArrayList<Book> filtered_books = new ArrayList<>();
        for(Book book: books) {
            if(book.getYear_publication() >= year) {
                filtered_books.add(book);
            }
        }
        return filtered_books;
    }
}