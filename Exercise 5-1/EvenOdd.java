import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int uNum = scan.nextInt();

        isEven(uNum);
    }
    public static boolean isEven(int number) 
    {
        boolean IsEven = true;

        if((number%2) != 0)
        {
            IsEven = false;
            System.out.println("Number is odd");
        }
        else
        {
        System.out.println("even");
    }
    return IsEven;
    }

}
