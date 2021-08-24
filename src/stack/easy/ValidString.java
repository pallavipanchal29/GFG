package stack.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidString
{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0)
        {
            int size = Integer.parseInt(br.readLine());
            String str = br.readLine();

            boolean isValid = false;
            Stack<Character> stack = new Stack<>();
            int countOne = 0;
            int countZero = 0;

            for(int i = 0;i<str.length();i++)
            {
                if(stack.isEmpty())
                {
                    if(str.charAt(i) == '1') {
                       isValid = false;
                       System.out.println("no");
                       return;
                    }
                    else
                    {
                        countZero++;
                        isValid = true;
                        stack.push(str.charAt(i));
                    }
                }
                else
                {
                    if(str.charAt(i) == '1')
                    {
                        countOne++;
                        if(countOne <= countZero)
                        {
                            isValid = true;
                            stack.push(str.charAt(i));
                        }
                        else {
                            isValid = false;
                        }
                    }
                    else
                    {
                        countZero++;
                        stack.push(str.charAt(i));
                    }
                }
            }
            boolean res = countOne == countZero && isValid;
            System.out.println(res == true ? "yes" : "no");
        }
    }
}
