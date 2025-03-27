package sub;

public class A22 {
    private int monthNumber;

    public A22(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Invalid month number. Must be between 1 and 12.");
        }
        this.monthNumber = monthNumber;
    }

    public String getMonthName() {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[monthNumber - 1];
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}
