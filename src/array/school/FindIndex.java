package array.school;

//Completed GFG - correct
public class FindIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 11, 30, 17, 30, 18, 13, 23, 10, 30, 11, 15, 21, 13, 13, 24, 25, 11, 15, 30, 15, 18, 13};
        int[] answers = findIndex(arr, arr.length, 899);

        System.out.println(answers[0] + " " + answers[1]);
    }

    static int[] findIndex(int a[], int N, int key)
    {
        if (N == 0)
            return new int[]{-1, -1};
        int i = 0;
        int j = N - 1;
        while (i < N && a[i] != key)
            i++;
        while (j >= 0 && a[j] != key)
            j--;

        return i <= j ? new int[]{i, j} : new int[]{-1, -1};
    }
}
