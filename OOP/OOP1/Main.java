package OOP1;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Liza", "Darsalia", "Female", 18, 60);

        System.out.println(human1.name + " " + human1.surname + " is beginner in coding");

        human1.sleepy();
        
    }
}