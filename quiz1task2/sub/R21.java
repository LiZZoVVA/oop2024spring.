package sub;

public class R21 {
    public static void main(String[] args) {
        // Create A21 object with rectangle dimensions
        A21 rectangle = new A21(10, 5);
        
        // Print area of the rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        // Create A22 object with month number
        A22 month = new A22(3);  // Example: March
        
        // Print month name
        System.out.println("Month Name: " + month.getMonthName());
    }
}
