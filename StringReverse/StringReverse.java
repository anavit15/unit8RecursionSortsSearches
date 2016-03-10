

/**
 * Write a description of class StringReverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringReverse
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class StringReverse
     */
    public StringReverse()
    {
        // initialise instance variables
        
    }

    public static String reverse(String text)
    {
        if (text.length()==0)
        {
            return text;
        }
        
        char c=text.charAt(0);
        String rest=text.substring(1);
        String reverseText=reverse(rest);
        reverseText+=c;
        return reverseText;
        
    }
    
    public static String reverseIter(String text)
    {
        String reverseText="";
        for (int i=text.length()-1;i>=0;i--)
        {
            char c=text.charAt(i);
            reverseText+=c;
        }
        return reverseText;
    }
    
    public static void main (String[] args)
    {
        System.out.println(StringReverse.reverse("Hello!"));
        System.out.println(StringReverse.reverseIter("Hello!"));
        System.out.println("Expected: !olleH");
    }

}
