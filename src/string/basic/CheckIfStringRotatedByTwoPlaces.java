package string.basic;

public class CheckIfStringRotatedByTwoPlaces
{
    public static void main(String[] args)
    {
        System.out.println(isRotated("mightandmagic","andmagicmigth"));
    }
    public static boolean isRotated(String s1, String s2 )
    {
        if(s1.length() != s2.length())
            return false;
        if(s1.length() < 2)
        {
            return s1.equals(s2);
        }

        String clockwise_rot = "";
        String anticlockwise_rot = "";
        int len = s2.length();

        anticlockwise_rot = anticlockwise_rot + s2.substring(len-2,len) + s2.substring(0,len-2);
        clockwise_rot = clockwise_rot + s2.substring(2,len) + s2.substring(0,2);

        return s1.equals(anticlockwise_rot) || s1.equals(clockwise_rot);
    }
}
