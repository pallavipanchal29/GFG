package array.school;

//completed GFG - correct
public class CompeteTheSkills
{
    static long ca,cb;
    public static void main(String[] args)
    {
       long[] a = new long[]{1804289384, 846930887, 1681692778};
       long[] b = new long[]{1714636916, 1957747794, 424238336};
       scores(a,b);
       System.out.println(ca+" "+cb);

    }
    public static void scores(long a[], long b[])
    {
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]==b[i])
                continue;
            else if(a[i] > b[i])
                ca++;
            else if(a[i]< b[i])
                cb++;
        }
    }
}
