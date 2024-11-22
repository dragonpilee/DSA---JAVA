import java.io.DataInputStream;
class binarysearch
{
    public static void main(String args[])
    {
        int a[]=new int [10];
        int n,temp;
        n=0;
        DataInputStream in = new DataInputStream(System.in);
        try
        {
            System.out.println("enter number of elements:");
            n=Integer.parseInt(in.readLine());
            System.out.println("enter elements:");
            for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(in.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
       for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("Array after sorting is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int beg,end,mid,item;
        item=0;
        try
        {
            System.out.println("enter item to search:");
            item=Integer.parseInt(in.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        beg=0;
        end=n-1;
        mid=(beg+end)/2;
        while(beg<=end&&a[mid]!=item)
        {
            if(item<a[mid])
            end=mid-1;
            else
            beg=mid+1;
            mid=(beg+end)/2;
        }
        if(a[mid]==item)
         {
            System.out.println("elements found,location="+mid);
         }
         else
         System.out.println("element noit found!!!!!");
       
    }
}