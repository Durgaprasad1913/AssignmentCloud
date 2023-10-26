import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(ispangram(s))
        {
            System.out.print("This is Pangram");
        }
        else{
            System.out.print("This is not a Pangram");
        }
    }
    public static boolean ispangram(String k)
    {
        String s=k.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(j)==s.charAt(i))
                {
                    c=1;
                }
            }
            if((c==0)&&(s.charAt(i)>='a'&&s.charAt(i)<='z'))
            {
                s1=s1+s.charAt(i);
            }
        }
        return s1.length()==26;
    }
}