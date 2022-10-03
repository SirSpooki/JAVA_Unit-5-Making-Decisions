import java.util.Scanner;
public class TestJobApplicants
{
   public static void main(String[] args)
   {
      JobApplicant app1 = new JobApplicant("Johnson", "312-345-9875",
            true, false, true, false);
      JobApplicant app2 = new JobApplicant("Kermit", "312-543-1275",
            true, false, false, false);
      JobApplicant app3 = new JobApplicant("Lawrence", "608-288-09125",
            true, false, true, true);
      JobApplicant app4 = new JobApplicant("Mitchell", "815-288-3881",
            true, true, true, true);
      String qualifiedMsg = "is qualified for an interview   ";
      String notQualifiedMsg = "is not qualified for an interview at this time   ";

      display(app1, sendMessage(isQualified(app1)));
      display(app2, sendMessage(isQualified(app2)));
      display(app3, sendMessage(isQualified(app3)));
      display(app4, sendMessage(isQualified(app4)));
      

   }
   public static boolean isQualified(JobApplicant app)
   {
        boolean isQual;
        boolean WORD = app.getHasWordSkill();
        boolean SHEET = app.getHasSpreadsheetSkill();
        boolean DATA = app.getHasDatabaseSkill();
        boolean GRAPHIC = app.getHasGraphicsSkill();
        int count = 0;

        if(WORD)
            {
                count  += 1;
            }
        else if (SHEET)
            {
                count += 1;
            }
        if (DATA)
            {
                count +=1;
            }
        if (GRAPHIC)
            {
                count +=1;
            }
        if (count >= 3)
            {
                isQual = true;
            }
        else
            {
                isQual = false;
            }
        return isQual;  
   }
   public static void display(JobApplicant app, String msg)
   {
      System.out.println(app.getName() + " " + msg +
         "  Phone: " + app.getPhone());
   }

    public static String sendMessage(Boolean x)
        {
            String qualifiedMsg = "is qualified for an interview   ";
            String notQualifiedMsg = "is not qualified for an interview at this time   "; 
            String X;

                if(!x)
                    {
                        X = notQualifiedMsg; 
                    }
                else
                    {
                        X = qualifiedMsg;
                    }
            return X;
   }
}
