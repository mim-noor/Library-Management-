public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.name = "Mim Nur";
        librarian.issueBooks();
        librarian.searchBk();

        Books book = new Books();
        book.AuthorName = "J.K. Rowling";
        book.addToCatalog();

        Students student = new Students();
        student.sName = "Sara";
        student.checkoutBk();

        Alert alert = new Alert();
        alert.bookname = "Harry Potter";
        alert.fine = 100;
        alert.viewAlert();
        alert.fineCall();
    }
}

