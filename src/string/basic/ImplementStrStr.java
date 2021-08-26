package string.basic;

//Completed GFG - correct
public class ImplementStrStr
{
    public static void main(String[] args)
    {
        System.out.println(strstr("aaaaa","bba"));
    }
    //Function to locate the occurrence of the string x in the string s.
    static int strstr(String haystack, String needle)
    {
        if(haystack==null || needle==null)
            return 0;

        if(needle.length() == 0)
            return 0;

        for(int i=0; i<haystack.length(); i++){
            if(i + needle.length() > haystack.length())
                return -1;

            int m = i;
            for(int j=0; j<needle.length(); j++){
                if(needle.charAt(j)==haystack.charAt(m)){
                    if(j==needle.length()-1)
                        return i;
                    m++;
                }else{
                    break;
                }

            }
        }
        return -1;
    }
}
