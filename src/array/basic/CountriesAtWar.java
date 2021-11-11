package array.basic;

//Completed GFG - correct
public class CountriesAtWar
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{9};
        int[] brr = new int[]{8};
        System.out.println(Country_at_war(arr,brr,arr.length));
    }
    // Function for finding maximum and value pair
    public static String Country_at_war (int arr[], int brr[], int n)
    {
        int countA = 0;
        int countB = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == brr[i])
            {
                countA--;
                countB--;
            }
            else if(arr[i] > brr[i])
                countB--;
            else
                countA--;
        }
        if(countA == countB)
            return "DRAW";
        else if(countA > countB)
            return "A";
        else
            return "B";
    }
}
