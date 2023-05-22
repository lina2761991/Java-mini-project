package university;


import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void lendBook(Book book) {
        if (book.isAvailable()) {
            book.checkOut();
        } else {
            System.out.println("	- Book is not available: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.returnBook();
        } else {
            System.out.println("	- Book is already available: " + book.getTitle());
        }
    }
}
