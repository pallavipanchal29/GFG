package array.easy;

public class SmallestSubarraySumGreaterThanX {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 5, 2, 7};
        System.out.println(sb(arr, arr.length, 9));
    }

    public static int sb(int a[], int n, int x)
    {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (j < n)
        {
            //keep calculating sum till sum < target or j <n
            while (sum <= x && j < n)
            {
                sum = sum + a[j];
                j++;
            }
            //when sum is greater than target sum, calculate min length and keep on reducing sum till sum <= x

            while (sum > x && i < n)
            {
                if (j - i < min)
                    min = j - i;

                sum = sum - a[i];
                i++;
            }
        }
        return min;
    }
}
