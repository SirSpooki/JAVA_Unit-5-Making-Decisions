import java.util.Scanner;
public class ShadyRestRoom {
    public static void main (String args[]) 
    {
        int user;
        final int QUEEN = 125;
        final int KING = 139;
        final int SUITE = 165;
        final int ELSE = 0;
        System.out.println("Menu\n");
        System.out.println("(1) Queen bed \n(2) King bed \n(3) Suite with a king bed and pull-out couch");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Selection (1, 2, or 3)");
        user = scan.nextInt();

        if (user == 1)
            {
                System.out.println("You selected Queen bed  $"+QUEEN);
            }
        else if (user == 2)
            {
                System.out.println("You selected Queen bed  $"+KING);
            }
        else if (user == 3)
            {
                System.out.println("You selected Queen bed  $"+SUITE);
            }
        else
        {
            System.out.println("You selected an invalid option  $"+ELSE);
        }
    }
}
