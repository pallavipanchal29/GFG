package string.basic;

public class KeypadTyping
{
    public static void main(String[] args)
    {
        String s = "geeksforgeeks";
        System.out.println(printNumber(s,s.length()));
    }
    public static String printNumber(String s, int n)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++)
        {
            switch (s.charAt(i))
            {
                case 'a':
                case 'b':
                case 'c':
                    sb.append(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    sb.append(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    sb.append(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    sb.append(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    sb.append(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    sb.append(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    sb.append(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    sb.append(9);
                    break;
            }
        }
        return sb.toString();
    }
}
