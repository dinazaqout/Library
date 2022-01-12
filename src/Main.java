public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in our Library\n");
        BookHelper bookHelper = new BookHelper();
        int choosedNumber = bookHelper.addScanner();
        if (choosedNumber == 6) {
            System.out.println("Goodbye");
           // return;
        }
        while (choosedNumber != 6) {
            // 1 = Enter item
            if (choosedNumber == 1) {
                bookHelper.addBook();
            }
            // 2 = Delete item
            else if (choosedNumber == 2) {
                bookHelper.deleteBook();
            }
            // 3 = Display items
            else if (choosedNumber == 3) {
                bookHelper.displayBooks();
            }
            // 4 = Sorting items via bookNumber
            else if (choosedNumber == 4) {
                bookHelper.sortBooks();
            }
            // 5 = Search item via bookName
            else if (choosedNumber == 5) {
                bookHelper.searchBook();
            }
            // 6 = Exit
            else {
                System.out.println("Something went wrong.\n");
            }
            choosedNumber = bookHelper.addScanner();
            if (choosedNumber == 6) {
            System.out.println("Goodbye");
           // return;
        }
        }
    }
}