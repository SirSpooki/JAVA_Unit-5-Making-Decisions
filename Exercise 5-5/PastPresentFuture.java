import java.util.*;
import java.time.*;
public class PastPresentFuture {
    public static void main (String args[]) 
    {
        int month, day, year;
        int currMonth, currDay, currYear;

        LocalDate TODAY = LocalDate.now();
        currMonth = TODAY.getMonthValue();
        currDay = TODAY.getDayOfMonth();
        currYear = TODAY.getYear();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month: ");
        month = scan.nextInt();
        System.out.println("Enter a day: ");
        day = scan.nextInt();
        System.out.println("Enter a year: ");
        year = scan.nextInt();

        if (year != currYear)
            {
               System.out.println(year +" is not this year"); 
            }
        else if (month < currMonth)
            {
                System.out.println(month +" was a month earlier this year");
            }
        else if (month > currMonth)
            {
                System.out.println(month +" is a month later this year");
            }
        else if (month == currMonth)
            {
                System.out.println(month +" is this month");
            }
    }
}


