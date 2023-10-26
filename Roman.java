import java.util.Scanner;
class A
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
      
        s=s.replace(" ","");
        
        char a[]={'I','V','X','L','C','D','M'};       
        int b[]={1,5,10,50,100,500,1000};             
        int k=0,sum=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<a.length;j++)
            {
              l=0;
                if(a[j]==s.charAt(i))
                {
                    k=b[j];
                break;
                }
            }
            if(i<s.length()-1)
            {
                for(int j=0;j<a.length;j++)
                {
                    if(a[j]==s.charAt(i+1))
                    {
                        l=b[j];
                    }
                }
            }
            if(k>=l)
            {
                sum=sum+k;
            }
            else
            {
                sum=sum-k;
            }
        }
        System.out.print(sum);
    }
}