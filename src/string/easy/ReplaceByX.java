package string.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceByX
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0)
        {
            String input = br.readLine();
            String patt = br.readLine();

            input = input.replaceAll(patt,"X");
            System.out.println(input);
        }
    }
}
