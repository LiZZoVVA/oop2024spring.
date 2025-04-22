package library;

public class LibraryTester {
public static void main(String[] args) {
Student s1 = new Student();
s1.setName("Maka");
s1.setSurname("Kapanadze");
s1.setPn("12345678912");
Student s2 = new Student();
s2.setName("Giorgi");
s2.setSurname("Giorgadze");
s2.setPn("98765432105");
Book b1 = new Book();
b1.setTitle("Lord of the Rings");
b1.setAuthor("Tolkien");
Book b2 = new Book();
b2.setTitle("Introduction to OOP");
b2.setAuthor("Paata Gogishvili");
LMS lms = new LMS();
lms.addBook(b1);
lms.addBook(b1);
lms.addBook(b2);
lms.removeBook(b1);
lms.printStorage();
}
}