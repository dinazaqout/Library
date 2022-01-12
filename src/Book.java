import java.util.Date;
import java.util.StringJoiner;

public class Book {
    private String BookName;
    private String bookAuthor;
    private String Borrower;
 

    public Book() {
    }

    public Book(Book newBook) {
        this.BookName = newBook.BookName;
        this.bookAuthor = newBook.bookAuthor;
         this.Borrower = newBook.Borrower;
    }

    public Book(String Book_name, String book_author, String Borrower) {
        this.BookName = Book_name;
        this.bookAuthor = book_author;
        this.Borrower = Borrower; 
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String Book_name) {
        this.BookName = Book_name;
      
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String book_author) {
        this.bookAuthor = book_author;
    }
 
    public String getBorrower() {
        return Borrower;
    }

    public void setBorrower(String Borrower) {
        this.Borrower = Borrower;
    }

 

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("BookName='" + BookName + "'")
                .add("bookAuthor='" + bookAuthor + "'")
                .add("Borrower='" + Borrower + "'")              
                .toString();
    }
}
