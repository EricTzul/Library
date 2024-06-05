import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<book> listOfBooks;
    private List<book> borrowedBooks;

    public Library() {
        this.listOfBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }
    public void addBook(book book) {
        listOfBooks.add(book);
        System.out.println("Book '" + book.title_name() + "' has been added to the library.");
    }

    public void borrowBook(String ISBN) {
        for (book book : listOfBooks) {
            if (book.ISBN_lookup().equals(ISBN)) {
                if (!book.borrowed()) {
                    book.borrowed();
                    borrowedBooks.add(book);
                    listOfBooks.remove(book);
                    return;
                } else {
                    System.out.println("This book is currently not available for borrowing.");
                    return;
                }
            }
        }
        System.out.println("Book with ISBN '" + ISBN + "' is not available in the library.");
    }

    public void returnBook(String ISBN) {
        for (book book : borrowedBooks) {
            if (book.ISBN_lookup().equals(ISBN)) {
                book.returnBook();
                borrowedBooks.remove(book);
                listOfBooks.add(book);
                return;
            }
        }
        System.out.println("Book with ISBN '" + ISBN + "' is not borrowed from this library.");
    }

    public void listAvailableBooks() {
        System.out.println("List of Available Books:");
        for (book book : listOfBooks) {
            System.out.println(book.details());
        }
    }
}
