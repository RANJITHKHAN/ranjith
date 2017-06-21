import java.util.*;
class vowels
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        char n=a.next().charAt(0);
        System.out.println(n);
        if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
        {
        System.out.println("vowels");
        }
        else
        {
        System.out.println("consonant");
        }
        
    }
}
