package array.basic;

//Completed GFG - correct
//Look for solution in GFG here its wrong
public class ProductOfArrayElements
{
    public static void main(String[] args)
    {
        Long[] arr = new Long[]{1L, 2L, 3L, 4L};
        System.out.println(product(arr,4L,arr.length));

    }
    public static Long product(Long arr[], Long mod, int n)
    {
        Long product = 1L;
        for(int i = 0;i<n;i++)
            product = product * arr[i];

        return product % mod;
    }
}
