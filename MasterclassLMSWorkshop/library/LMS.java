package MasterclassLMSWorkshop.library;

import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> storage = new ArrayList<>();

    // This method adds a book to the storage
    public void addBook(Book book) {
        storage.add(book);
    }

    // This method removes a book from the storage
    public boolean removeBook(Book book) {
        for (int i = 0; i < storage.size(); i++) {
            Book b = storage.get(i);
            // Check if both title and author are the same
            if (b.getTitle().equals(book.getTitle()) &&
                b.getAuthor().equals(book.getAuthor())) {
                storage.remove(i);  // remove that book
                return true;        // say we removed it
            }
        }
        return false;  // book was not found
    }

    // This method prints all the books in storage
    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty.");
        } else {
            System.out.println("Books in the Library:");
            for (Book b : storage) {
                System.out.println(b);
            }
        }
    }

}