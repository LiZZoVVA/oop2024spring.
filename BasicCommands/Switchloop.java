public class Switchloop {
    public static void main(String[] args) {
        String Day = "Monday";
        String Month = "January";
        
        switch (Day){

            case "Monday":
                System.out.println("It's the 1st day of the week");
                break;
            case "Tuesday":
                System.out.println("It's the 2nd day of the week");
                break;
            case "Wednesday":
                System.out.println("It's the 3rd day of the week");
                break;
            case "Thursday":
                System.out.println("It's the 4th day of the week");
                break;
            case "Friday":
                System.out.println("It's the 5th day of the week");
                break;
            case "Saturday":
                System.out.println("It's the 6th day of the week");
                break;
            case "Sunday":
                System.out.println("It's the 7th day of the week");
                break;
            default:
                System.out.println("You dumb. Don't you know there is no such week day?");
            }
        

        switch (Month) {

            case "January":
                System.out.println("It's the 1st day of the year");
                break;
            case "Fabruary":
                System.out.println("It's the 2nd day of the year");
                break;   
            case "March":
                System.out.println("It's the 3rd day of the year");
                break;
            case "April":
                System.out.println("It's the 4th day of the year");
                break;
            case "May":
                System.out.println("It's the 5th day of the year");
                break;   
            case "June":
                System.out.println("It's the 6th day of the year");
                break;  
            case "July":
                System.out.println("It's the 7th day of the year");
                break;
            case "August":
                System.out.println("It's the 8th day of the year");
                break;   
            case "September":
                System.out.println("It's the 9th day of the year");
                break;
            case "Octomber":
                System.out.println("It's the 10th day of the year");
                break;
            case "November":
                System.out.println("It's the 11th day of the year");
                break;   
            case "December":
                System.out.println("It's the 12th day of the year");
                break;  
            default:
                System.out.println("You dumb. Don't you know there is no such month in a year?");   
        }

    }
}
