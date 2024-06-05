import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int user;
        Scanner keybaord = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Menu");
            System.out.println("1.Add a Book");
            System.out.println("2.Borrow a Book");
            System.out.println("3.Return a Book");
            System.out.println("4.List Available Books");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            user = keybaord.nextInt();
            switch (user) {
                case 1:
                    System.out.println("Enter Book Title: ");
                    String title = keybaord.nextLine();
                    System.out.println("Enter Author Name: ");
                    String author = keybaord.nextLine();
                    System.out.println("Enter ISBN: ");
                    String isbn = keybaord.nextLine();
                    book newBook = new book(title, author, isbn);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.println("Enter ISBN of the Book to Borrow: ");
                    String book_borrow = keybaord.nextLine();
                    library.borrowBook(book_borrow);
                    break;
                case 3:
                    System.out.println("Enter ISBN of the Book to Return: ");
                    String book_return = keybaord.nextLine();
                    library.returnBook(book_return);
                    break;
                case 4:
                    library.listAvailableBooks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
