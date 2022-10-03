import java.util.Scanner;
public class ShadyRestRoom2
{
   // Modify the code below
   public static void main (String args[])
   {
      int selection,    view;
      int price;
      String result;
      String viewResult = " ";
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,SPRICE = 165;
      final int LAKE = 1, PARK = 2;
      final String LSTRING = "a lake", PSTRING = "a park";
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         INVALIDSTRING = "an invalid option";
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
      System.out.print("Enter Selection (1, 2, or 3) >> ");
      selection = in.nextInt();
      if(selection == QUEEN)
      {
         System.out.println("Please choose a view: \n");
         System.out.println("(" + LAKE + ") " + LSTRING);
         System.out.println("(" + PARK + ") " + PSTRING);
         System.out.print("Enter Selection (1 or 2) >>");
         view = in.nextInt();
         switch(view)
         {
             case 1:
                result = QSTRING;
                price = QPRICE + 15;
                viewResult = LSTRING;
                break;
            case 2:
                result = QSTRING;
                price = QPRICE ;
                viewResult = PSTRING;
                break;
            default:
                System.out.println("Invalid Selection");
                result = QSTRING;
                price = QPRICE + 15;
                viewResult = LSTRING;
         }
      }
      else
         if(selection == KING)
         {
         System.out.println("Please choose a view: \n");
         System.out.println("(" + LAKE + ") " + LSTRING);
         System.out.println("(" + PARK + ") " + PSTRING);
         System.out.print("Enter Selection (1 or 2) >>");
         view = in.nextInt();
         switch(view)
         {
             case 1:
                result = KSTRING;
                price = KPRICE + 15;
                viewResult = LSTRING;
                break;
            case 2:
                result = KSTRING;
                price = KPRICE ;
                viewResult = PSTRING;
                break;
            default:
                System.out.println("Invalid Selection");
                result = KSTRING;
                price = KPRICE + 15;
                viewResult = LSTRING;
         }
         }
         else
            if (selection == SUITE)
            {
                System.out.println("Please choose a view: \n");
         System.out.println("(" + LAKE + ") " + LSTRING);
         System.out.println("(" + PARK + ") " + PSTRING);
         System.out.print("Enter Selection (1 or 2) >>");
         view = in.nextInt();
         switch(view)
         {
             case 1:
                result = SSTRING;
                price = SPRICE + 15;
                viewResult = LSTRING;
                break;
            case 2:
                result = SSTRING;
                price = SPRICE ;
                viewResult = PSTRING;
                break;
            default:
                System.out.println("Invalid Selection");
                result = SSTRING;
                price = SPRICE + 15;
                viewResult = LSTRING;
         }
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             }
      System.out.println("You selected " + result + " with " + viewResult + " view for $" + price);
   }
}
