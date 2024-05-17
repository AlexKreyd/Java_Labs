public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void issueBook(Library lib, Reader reader, Book book, Boolean issue_type) {
        if (lib.checkBook(book) && !reader.getOnBlacklist()) {
            reader.addBook(book);
            System.out.print("Библиотекарь " + this.name + " выдал книгу " +
                    book.getTitle() + " читателю " + reader.getName());
            if (issue_type) {
                System.out.println(" на дом");
            }
            else {
                System.out.println(" в читальный зал");
            }
        }
        else {
            System.out.println("Книга " + book.getTitle() + " не найдена в каталоге");;
        }
    }

    public void addToBlackList(Reader reader) {
        reader.setOnBlacklist(true);
        System.out.println("Библиотекарь " + this.name + " добавил читателя " +
                reader.getName() + " в черный список");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
