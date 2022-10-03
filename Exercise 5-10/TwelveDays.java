import java.util.*;
public class TwelveDays {
    static Scanner scan = new Scanner(System.in);
    public static void main (String args[]) 
    {
        int day = getChoice();
        String suffix = suffix(day);

        print("On the " + day + suffix + " day of Christmas");
        print("My true love gave to me");
        songLyric(day);


    }
    public static int getChoice() 
        {
            System.out.println("Enter Day for Song");
            int user = scan.nextInt();
            if (user > 12 || user < 1)
                {
                    print("invalid input");
                }

            return user;
        }

    public static void songLyric(int userChoice)
        {
            
            switch(userChoice)
            {
                case 12:
                    {
                        print("Twelve drummers drumming");
                    }
                case 11:
                    {
                        print("Eleven pipers piping");
                    }   
                case 10:
                    {
                        print("Ten lords a-leaping");
                    }
                case 9:
                    {
                        print("Nine ladies dancing");
                    }
                case 8:
                    {
                        print("Eight maids a-milking");
                    }
                case 7:
                    {
                        print("Seven swans a-swimming");
                    }
                case 6:
                    {
                        print("Six geese a-laying");
                    }
                case 5:
                    {
                        print("Five golden rings");
                    }
                case 4:
                    {
                        print("Four calling birds");
                    }
                case 3:
                    {
                        print("Three French hens");
                    }
                case 2:
                    {
                        print("Two turtle doves and");
                    }
                case 1:
                    {
                        print("A partridge in a pear tree");
                    }
                default:
            }
        }
    public static String print(String x)
        {
            System.out.println(x);
            return x;
        }
    public static String suffix(int n)
        {
            String suff = "";
             switch(n)
             {
                case 1:
                    {
                        suff = "st";
                    }
                break;

                case 2:
                    {
                        suff = "nd";
                    }
                break;
                case 3:
                    {
                        suff = "rd";
                    }
                break;

                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    {
                        suff = "th";
                    }
                break;

                default:
                    {
                        print("Invalid Input");
                    }
             }
             return suff;
        }
}

/*
 * 
On the 12th day of Christmas
My true love gave to me
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three French hens
Two turtle doves and
A partridge in a pear tree
 */

