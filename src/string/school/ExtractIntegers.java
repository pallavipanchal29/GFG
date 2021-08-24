package string.school;

import java.util.ArrayList;

//Completed GFG - correct
public class ExtractIntegers
{
    public static void main(String[] args)
    {
        System.out.println(extractIntegerWords("geeksforgeeks"));
    }
    static ArrayList<String> extractIntegerWords(String s)
    {
        ArrayList<String> integers = new ArrayList<>();
        String temp = "";
        for(int i = 0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                temp = temp + s.charAt(i);
            else
            {
                if(temp.length() != 0)
                {
                    integers.add(temp);
                    temp = "";
                }
            }
        }
        if(temp != "")
            integers.add(temp);
        return integers;
    }
}
