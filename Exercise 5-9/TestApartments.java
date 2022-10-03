import java.util.*;
public class TestApartments {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Apartment apt1 = new Apartment(101, 2, 1, 725);
        Apartment apt2 = new Apartment(102, 2, 1.5, 775);
        Apartment apt3 = new Apartment(103, 3, 2, 870);
        Apartment apt4 = new Apartment(104, 3, 2.5, 960);
        Apartment apt5 = new Apartment(105, 3, 3, 1100);
        int bdrms;
        int baths;
        double rent;
        System.out.print("Enter minimum number of bedrooms needed >> ");
        bdrms = input.nextInt();
        System.out.print("Enter minimum number of bathrooms needed >> ");
        baths = input.nextInt();
        System.out.print("Enter maximum rent willing to pay >> ");
        rent = input.nextDouble();
        System.out.println("\nApartments meeting citeria of\nat least " + bdrms +
                           " bedrooms, at least " + baths + " baths, and " + " no more than $" +
                           rent + " rent:");
        
        display(apt1, checkApt(apt1, bdrms, baths, rent));
        display(apt2, checkApt(apt2, bdrms, baths, rent));
        display(apt3, checkApt(apt3, bdrms, baths, rent));
        display(apt4, checkApt(apt4, bdrms, baths, rent));
        display(apt5, checkApt(apt5, bdrms, baths, rent));
    }
    public static boolean checkApt(Apartment apt, int bdrms, double baths, double rent) 
    {
        int count = 0;
        boolean aptMatch;
        if (apt.getBedrooms() >= bdrms)
            {
                count += 1;
            }
        if (apt.getBaths() >= baths)
            {
                count += 1;
            }
        if(apt.getRent() <= rent)
            {
                count += 1;
            }
        if (count == 3)
            {
                aptMatch = true;
            }
        else
            {
                aptMatch = false;
            }
        return aptMatch;
    }
    public static void display(Apartment apt, boolean aptM) 
    {
        if (aptM)
        {   
            System.out.println("   Apt #" + apt.getAptNumber() + "    " + apt.getBedrooms() +
                           " bedrooms, and " + apt.getBaths() + " baths. Rent $" + apt.getRent());
        }
        else
        {
            System.out.println("No apartments met your criteria");
        }
        
    }
}


