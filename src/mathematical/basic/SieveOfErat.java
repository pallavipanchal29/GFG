package mathematical.basic;

import java.util.ArrayList;

public class SieveOfErat
{
    public static void main(String[] args)
    {
        System.out.println(sieveOfEratosthenes(10));
    }
    static ArrayList<Integer> sieveOfEratosthenes(int n)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++)
        {
            if (prime[p] == true)
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i = 2;i<=n;i++)
        {
            if(prime[i] == true)
                answers.add(i);
        }
        return answers;
    }
}
