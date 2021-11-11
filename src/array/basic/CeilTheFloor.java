package array.basic;

//Completed GFG - correct
public class CeilTheFloor
{
    static class Pair
    {
        int floor;
        int ceil;

        public Pair(int floor,int ceil)
        {
            this.floor = floor;
            this.ceil = ceil;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 6, 8, 9, 6, 5, 5, 6};
        Pair pair = getFloorAndCeil(arr,arr.length,7);

        System.out.println(pair.floor+" "+pair.ceil);
    }
    static Pair getFloorAndCeil(int[] arr, int n, int x)
    {
        int largest = -1;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ;i<n;i++)
        {
            if(arr[i] >= x)
            {
                smallest = Math.min(arr[i],smallest);
            }
            if(arr[i] <= x)
            {
                largest = Math.max(arr[i],largest);
            }
        }
        smallest = smallest == Integer.MAX_VALUE ? -1 : smallest;
        return new Pair(largest,smallest);
    }
}
