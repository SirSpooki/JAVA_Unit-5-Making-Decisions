import java.util.*;
import java.util.Scanner;
public class CellPhoneService {
    public static void main (String args[]) 
    {
        int talkNeeded = 0, textNeeded, dataNeeded;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter talk minutes needed");
        talkNeeded = scan.nextInt();
        System.out.println("Enter text messages needed");
        textNeeded = scan.nextInt();
        System.out.println("Enter gigabytes of data needed");
        dataNeeded = scan.nextInt();

        if (dataNeeded != 0)
            {
                if ((dataNeeded >= 3))
                    {
                        System.out.println("Plan F  $83 per month");
                    }
                else if ((dataNeeded > 0) && (dataNeeded < 3))
                    {
                        System.out.println("Plan E  $79 per month");
                    }
            }
        if (talkNeeded < 500)
            {
               if ((textNeeded == 0) && (dataNeeded == 0))
                    {
                        System.out.println("Plan A  $49 per month");
                    } 
               else if ((textNeeded > 0) && (dataNeeded == 0))
                    {
                        System.out.println("Plan B  $55 per month");
                    }
            }
        else if (talkNeeded >= 500)
            {
                if (dataNeeded == 0)
                    {
                        if (textNeeded < 100)
                            {
                                System.out.println("Plan C  $61 per month");
                            }
                        if (textNeeded >= 100)
                            {
                                System.out.println("Plan D  $70 per month");
                            }
                    }
            }
    }
}
