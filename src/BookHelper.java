import java.util.Scanner;

public class BookHelper {

    Book[] arrayStack = new Book[50];

    int top = -1;

    public void push(Book item) {
        top = top + 1;
        arrayStack[top] = item;
        System.out.println("Your book " + arrayStack[top].toString() + " is added.\n");
    }

    public void pop(String bookName) {
        if (!isEmpty()) {
            for (int i = 0; i < arrayStack.length; i++) {
                if (arrayStack[i] != null) {
                    if (arrayStack[i].getBookName().equals(bookName)) {
                        System.out.println("Your book " + bookName + " is deleted.");
                        arrayStack[i] = null;
                        top = top - 1;
                        //return;
                    }
                }
            }
            System.out.println("Your book "+bookName+" is not exist.");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            for (int i = 0; i < arrayStack.length; i++) {
                if (arrayStack[i] != null) {
                    System.out.println(arrayStack[i]);
                }
            }
        }
    }

    public void search(String bookName) {
        if (!isEmpty()) {
            for (int i = 0; i < arrayStack.length; i++) {
                if (arrayStack[i] != null) {
                    if (arrayStack[i].getBookName().equals(bookName)) {
                        System.out.println(arrayStack[i]);
                        return;
                    }
                }
            }
            System.out.println("Sorry, this book " + bookName + " is not exist.");
        }
    }

    public void sort() {
        Book temp;
        for (int i = 0; i < arrayStack.length; i++) {
            if (arrayStack[i] != null) {
                for (int j = i + 1; j < arrayStack.length; j++) {
                    if (arrayStack[i] != null && arrayStack[j] != null) {
                       for (int x = 0; x < arrayStack[i].getBookName().length(); x++) {
                            if (arrayStack[i].getBookName().length() >= x && arrayStack[j].getBookName().length() >= x) {
                                if (arrayStack[i].getBookName().charAt(x) > arrayStack[j].getBookName().charAt(x)) {
                                    temp = arrayStack[i];
                                    arrayStack[i] = arrayStack[j];
                                    arrayStack[j] = temp;
                                    break;
                                }
                                else if (arrayStack[i].getBookName().charAt(x) < arrayStack[j].getBookName().charAt(x)) {
                                     break;
                                }
                            }
                        }
                    }
                }
            }
        }
        // print Books after sorted it
        peek();
    }


    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("Sorry, there is no Books in our Library.");
            return true;
        }
        return false;
    }

    public int addScanner() {
        // add scanner
        System.out.println("Choose one of the following:");
        System.out.println("1. Enter Item");
        System.out.println("2. Delete Item");
        System.out.println("3. Display The Items");
        System.out.println("4. Sorting The Items");
        System.out.println("5. Search Item");
        System.out.println("6. Exit\n");
        Scanner s = new Scanner(System.in);
        String userInput = s.next();
        try {
            int userNumber = Integer.parseInt(userInput);
            return userNumber;
        } catch (NumberFormatException ex) {
        }
        return 0;
    }

    public void addBook() {
        Book book = new Book();
        // Book Name
        System.out.println("Enter book name:");
        Scanner bookName = new Scanner(System.in);
        String bookNameFromUser = bookName.next();
        book.setBookName(bookNameFromUser);
        // bookAuthor
        System.out.println("Enter book author:");
        Scanner bookAuthor = new Scanner(System.in);
        book.setBookAuthor(bookAuthor.next());
        // Borrower
        System.out.println("Enter borrower:");
        Scanner borrower = new Scanner(System.in);
        book.setBorrower(borrower.next());
        // add book to list
        push(book);
    }


    public void deleteBook() {
        System.out.println("Enter book name to delete it:");
        Scanner s = new Scanner(System.in);
        String bookName = s.next();
        pop(bookName);
    }

    public void displayBooks() {
        peek();
    }


    public void sortBooks() {
        // use sort class and method
        if (top >= 1) {
            System.out.println("Books will be sorted via book name.");
            sort();
        } else if (top == 0) {
            System.out.println("There is just a one Book in our Library.");
        } else if (top == -1) {
            System.out.println("There is no Books in our Library.");
        }
    }

    public void searchBook() {
        System.out.println("Enter book name to search:");
        Scanner s = new Scanner(System.in);
        String bookName = s.next();
        search(bookName);
    }
}