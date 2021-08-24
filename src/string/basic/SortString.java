package string.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//completed GFG - correct
public class SortString
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests-- > 0)
        {
            String str = br.readLine();
            char[] temp = new char[26];
            for(int i = 0;i<str.length();i++)
            {
                temp[str.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<temp.length;i++)
            {
                int c = temp[i];
                while (c>0)
                {
                    sb.append((char)(i+'a'));
                    c--;
                }

            }
            System.out.println(sb.toString());
        }
    }
}
