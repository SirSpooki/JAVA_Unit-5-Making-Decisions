import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class AscendingAndDescending {
    public static int int1, int2, int3;
    public static void main(String[] args) 
    {

        printForUser();
        arrayStuff();
        

    }
    public static void printForUser()
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int1 = scan.nextInt();

        System.out.println("Enter an integer: ");
        int2 = scan.nextInt();

        System.out.println("Enter an integer: ");
        int3 = scan.nextInt();
    }
    public static void arrayStuff()
    {
        Integer[] acending = {int1,int2,int3};
        Integer[] decending = {int1,int2,int3};

        Arrays.sort(acending);
        Arrays.sort(decending, Collections.reverseOrder());

        System.out.println("Ascending: " + acending[0]+" "+acending[1]+" "+acending[2]);
        System.out.println("Descending: " + decending[0]+" "+decending[1]+" "+decending[2]);
    }
}
