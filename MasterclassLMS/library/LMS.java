package library;
import java.util.ArrayList;
import java.util.List;
public class LMS {
// Mapping with Book and the number of this book in the library
private List<Book> storage = new ArrayList<Book>();
// adds the book to the library
public void addBook(Book book) {
storage.add(book);
}
// removes the book from the library
public boolean removeBook(Book book) {
boolean removed = false;
for (int i = 0; i < storage.size(); i++) {
Book b = storage.get(i);
if (b.getTitle().equals(book.getTitle()) && b.getAuthor().equals(book.getAuthor())) {
storage.remove(i);
removed = true;
break;
}
}
return removed;
}
public void printStorage() {
if (storage.isEmpty()) {
System.out.println("The storage is empty");
} else {
for (Book b: storage) {
System.out.println(b.getAuthor() + ", " + b.getTitle());
System.out.println();
}
}
}
}