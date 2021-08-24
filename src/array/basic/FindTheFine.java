package array.basic;

//Completed GFG - correct
public class FindTheFine
{
    public static void main(String[] args)
    {
        long[] car = new long[]{2222, 2223, 2224};
        long[] fine = new long[]{200, 300, 400};
        System.out.println(totalFine(3,8,car,fine));
    }
    public static long totalFine( long n, long date, long car[], long fine[])
    {
        long total = 0L;
        for(int i = 0;i<n;i++)
        {
            if(date %2 == 0)
            {
                if(car[i] % 2 == 1)
                    total = total + fine[i];
            }
            else
            {
                if(car[i] % 2 == 0)
                    total = total + fine[i];
            }
        }
        return total;
    }
}
