package string.school;

//Completed GFG - correct
public class UpperCaseConversion
{
    public static void main(String[] args)
    {
        System.out.println(transform("i love programming"));
    }
    public static String transform(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] temp = s.split(" ");
        for(int i = 0;i< temp.length;i++)
        {
            char[] arr = temp[i].toCharArray();
            sb.append(String.valueOf(arr[0]).toUpperCase());
            for(int j = 1;j<arr.length;j++)
                sb.append(arr[j]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
