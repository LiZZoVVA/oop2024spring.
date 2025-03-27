public class Whileloop {
    public static void main(String[] args) {
        int x = 10;
        while( x <= 10){
            System.out.println(x);
            x++;
        }
        while( x <15){
            System.out.println(x + " is more than 15");
            break;
        }
        do{ System.out.println("Haloooo");} //do is done at least onece, even if while is wronng
        while(x>100);
        
    }
}

