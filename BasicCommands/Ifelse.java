public class Ifelse {
    public static void main(String[] args) { 
    int x = -9;
    if( x == 10){
        System.out.println(" x is equal to " + x);
    }
    else if( x > 5 && x<9){
        System.out.println(" x is not equal to 10 and is between 5 and 9");
    }
    else{
        System.out.println("x  is equal to number less than 5. Its value is..." + x +"!");
    }
}
}