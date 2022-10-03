import java.util.*;
public class AcmePay {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        final int SHIFT1 = 1, SHIFT2 = 2, SHIFT3 = 3;
        final double RETIRE, GROSSPAY;
        final int YES = 1, NO = 2;
        final double PAY1 = 17, PAY2 = 18.5, PAY3 = 22;
        final double REG1, REG2, REG3;
        final double OVERTIME, NETPAY;
        int userShift, userHours, userChoice;

        System.out.println("Please enter shift - 1, 2, or 3");
        userShift = scan.nextInt();

        switch(userShift)
            {
                case SHIFT1:
                    {
                        System.out.println("Please enter hours worked");
                        userHours = scan.nextInt();

                        if (userHours > 40)
                            {
                                int over40 = userHours - 40;
                                int setUserHours = 40;
                                REG1 = setUserHours * PAY1;
                                OVERTIME = over40 * (PAY1 * 1.5);
                                NETPAY = REG1 + OVERTIME;
                                RETIRE = 0.0;

                                System.out.println("Hours worked is    " + userHours);
                                System.out.println("Hourly pay rate is " + PAY1);
                                System.out.println("Regular pay is     " + REG1);
                                System.out.println("Overtime pay is    " + OVERTIME);
                                System.out.println("Retirement deduction is    " + RETIRE);
                                System.out.println("Net pay is...................." + NETPAY);
                            }

                        else if (userHours < 40)
                            {
                                REG1 = userHours * PAY1;
                                OVERTIME = 0 * (PAY1 * 1.5);
                                NETPAY = REG1 + OVERTIME;
                                RETIRE = 0.0;

                                System.out.println("Hours worked is    " + userHours);
                                System.out.println("Hourly pay rate is " + PAY1);
                                System.out.println("Regular pay is     " + REG1);
                                System.out.println("Overtime pay is    " + OVERTIME);
                                System.out.println("Retirement deduction is    " + RETIRE);
                                System.out.println("Net pay is...................." + NETPAY);
                            }
                        }
                break;

                case SHIFT2:
                    {
                        System.out.println("Please enter hours worked");
                        userHours = scan.nextInt();

                        System.out.println("Do you want to participate in the retirement plan? \n  Enter 1 for Yes and 2 for No.");
                        userChoice = scan.nextInt();

                        if (userChoice == YES)
                            {
                                if (userHours > 40)
                                    {
                                        int over40 = userHours - 40;
                                        int setUserHours = 40;
                                        REG2 = setUserHours * PAY2;
                                        OVERTIME = over40 * (PAY2 * 1.5);
                                        GROSSPAY = REG2 + OVERTIME;
                                        RETIRE = GROSSPAY * .03;
                                        NETPAY = GROSSPAY - RETIRE;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY2);
                                        System.out.println("Regular pay is     " + REG2);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                                else if (userHours < 40)
                                    {
                                        int over40 = userHours - 40;
                                        REG2 = userHours * PAY2;
                                        OVERTIME = 0 * (PAY2 * 1.5);
                                        GROSSPAY = REG2 + OVERTIME;
                                        RETIRE = GROSSPAY * .03;
                                        NETPAY = GROSSPAY - RETIRE;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY2);
                                        System.out.println("Regular pay is     " + REG2);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                            }
                        else if (userChoice == NO)
                            {
                                if (userHours > 40)
                                    {
                                        int over40 = userHours - 40;
                                        int setUserHours = 40;
                                        REG2 = setUserHours * PAY2;
                                        OVERTIME = over40 * (PAY2 * 1.5);
                                        NETPAY = REG2 + OVERTIME;
                                        RETIRE = 0.0;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY2);
                                        System.out.println("Regular pay is     " + REG2);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                                else if (userHours < 40)
                                    {
                                        int over40 = userHours - 40;
                                        REG2 = userHours * PAY2;
                                        OVERTIME = 0 * (PAY2 * 1.5);
                                        NETPAY = REG2 + OVERTIME;
                                        RETIRE = 0.0;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY2);
                                        System.out.println("Regular pay is     " + REG2);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                            }
                        else
                            {
                                System.out.println("INVALID  - 1 or 2 ONLY");
                            }
                    }
                    break;

                case SHIFT3:
                    {
                       System.out.println("Please enter hours worked");
                        userHours = scan.nextInt();

                        System.out.println("Do you want to participate in the retirement plan? \n  Enter 1 for Yes and 2 for No.");
                        userChoice = scan.nextInt();

                        if (userChoice == YES)
                            {
                                if (userHours > 40)
                                    {
                                        int over40 = userHours - 40;
                                        int setUserHours = 40;
                                        REG3 = setUserHours * PAY3;
                                        OVERTIME = over40 * (PAY3 * 1.5);
                                        GROSSPAY = REG3 + OVERTIME;
                                        RETIRE = GROSSPAY * .03;
                                        NETPAY = GROSSPAY - RETIRE;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY3);
                                        System.out.println("Regular pay is     " + REG3);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                                else if (userHours < 40)
                                    {
                                        int over40 = userHours - 40;
                                        REG3 = userHours * PAY3;
                                        OVERTIME = 0 * (PAY3 * 1.5);
                                        GROSSPAY = REG3 + OVERTIME;
                                        RETIRE = GROSSPAY * .03;
                                        NETPAY = GROSSPAY - RETIRE;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY3);
                                        System.out.println("Regular pay is     " + REG3);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                            }
                        else if (userChoice == NO)
                            {
                                if (userHours > 40)
                                    {
                                        int over40 = userHours - 40;
                                        int setUserHours = 40;
                                        REG3 = setUserHours * PAY3;
                                        OVERTIME = over40 * (PAY3 * 1.5);
                                        NETPAY = REG3 + OVERTIME;
                                        RETIRE = 0.0;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY3);
                                        System.out.println("Regular pay is     " + REG3);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                                else if (userHours < 40)
                                    {
                                        int over40 = userHours - 40;
                                        REG3 = userHours * PAY3;
                                        OVERTIME = 0 * (PAY3 * 1.5);
                                        NETPAY = REG3 + OVERTIME;
                                        RETIRE = 0.0;

                                        System.out.println("Hours worked is    " + userHours);
                                        System.out.println("Hourly pay rate is " + PAY3);
                                        System.out.println("Regular pay is     " + REG3);
                                        System.out.println("Overtime pay is    " + OVERTIME);
                                        System.out.println("Retirement deduction is    " + RETIRE);
                                        System.out.println("Net pay is...................." + NETPAY);
                                    }
                            }
                        else
                            {
                                System.out.println("INVALID  - 1 or 2 ONLY");
                            }
                    } 
                break;

                default:
                    {
                        System.out.println("INVALID INPUT - 1, 2 or 3 ONLY");
                    }
                    break;
            }

        
  }
}
