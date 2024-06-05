public class book {
    private String title;
    private String author;
    private String ISBN;
    private boolean borrow;

    public book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.borrow = false;
    }
    public String title_name() {
        return title;
    }
    public String Author_name() {
        return author;
    }
    public String ISBN_lookup() {
        return ISBN;
    }
    public boolean borrowed() {
        return borrow;
    }
    public void borrow_book() {
        if (!borrow) {
            borrow = true;
            System.out.println("Book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is already borrowed.");
        }
    }

    public void returnBook() {
        if (borrow) {
            borrow = false;
            System.out.println("Boqok '" + title + "' has been returned.");
        } else {
            System.out.println("This book is not borrowed, so cannot be returned.");
        }
    }

    public String details() {
        return "Book Title: " + title + ", Author: " + author + ", ISBN: " + ISBN +
                ", Status: " + (borrow ? "Borrowed" : "Available");
    }
}
