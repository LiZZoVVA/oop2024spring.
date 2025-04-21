package OOP1;

public class Human {
    // constructor = special method that is called when an object is instantiated(created)
    // creating constructor within a class
    String name;
    String surname;
    String sex;
    int age;
    double weight;

    Human(String name, String surname, String sex, int age, double weight){
        this.name=name; //instead of this. will be written human1, human2 and eetc with their attributes
        this.surname=surname;
        this.sex=sex;
        this.age=age;
        this.weight=weight;
        }

        void sleepy(){
            System.out.println(this.name + " is being sleepy, and also ");
    }
        void wakingup(){
        System.out.println("Wake up sleepy heeaaaaddd!");
}
}
