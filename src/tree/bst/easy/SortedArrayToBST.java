package tree.bst.easy;

public class SortedArrayToBST
{
    private static int idx = 0;
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4};

        int[] answer = sortedArrayToBST(arr);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");

    }
    public static int[] sortedArrayToBST(int[] nums)
    {
        int[] res = new int[nums.length];
        idx = 0;
        sortedArraytoBST(nums,0,nums.length-1,res);
        return res;
    }

    private static void sortedArraytoBST(int[] nums, int start, int end, int[] res)
    {
        if(start > end)
            return;

        int mid = (start + end)/2;
        res[idx++] = nums[mid];
        sortedArraytoBST(nums,0,mid-1,res);
        sortedArraytoBST(nums,mid+1,nums.length-1,res);
    }
}
