import java.util.*;
class Number
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        System.out.println(n);
        if(n>0)
        {
        System.out.println("num is positive");
        }
        if(n<0)
        {
        System.out.println("num is negative");
        }
        if(n==0)
        {
        System.out.println("num is zero");
        }
    }
}
