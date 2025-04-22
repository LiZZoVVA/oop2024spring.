package MasterclassLMSWorkshop.library;

public class LibraryTester {
    public static void main(String[] args) {
        Book book1 = new Book("Lord of the Rings", "Tolkien");
        Book book2 = new Book("Anna Frank's Diary", "Anna Frank");

        LMS myLibrary = new LMS();

        myLibrary.addBook(book1);
        myLibrary.addBook(book1);  // adding twice
        myLibrary.addBook(book2);

        myLibrary.removeBook(book1);  // remove one copy

        myLibrary.printStorage();  // should print one book1 and one book2
    }
}
