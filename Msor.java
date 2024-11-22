import java.io.DataInputStream;
import java.io.*;
class msort
{
    int a[],n,b[];
    void getdata()throws Exception
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("enter number of elemets:");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
        b=new int[n];
        System.out.println(" Enter elements:");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
    }
    void display()
    {
       System.out.println("\n The array is: \n"); 
       for(int i=0;i<n;i++) 
       System.out.println(a[i]); 
    }
    void display1()
    {
        System.out.println("\n The array is:\n");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
    void sort()
    {
      merge(0,n-1);
    }
    void merge(int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            merge(low,mid);
            merge(mid+1,high);
            mergesort(low,mid,high);
        }
    }
    void mergesort(int low,int mid,int high)
    {
        int h=low,i=low,j=mid+1,k;
        while((h<=mid)&&(j<=high))
        {
            if(a[h]<=a[j])
            {
                b[i]=a[h];
                h++;
            }
            else
            {
                b[i]=a[j];
                j++;
            }
            i++;
        }
        if(h>mid)
        for(k=j;k<=high;k++)
        {
            b[i]=a[k];
            i++;
        }
        else
        for(k=h;k<=mid;k++)
        {
            b[i]=a[k];
            i++;
        }
        for(k=low;k<=high;k++)
        a[k]=b[k];
    }
}
class Msor 
{
   public static void main(String args[])throws Exception
    {
        msort obj=new msort();
        obj.getdata();
        obj.display();
        obj.sort();
        obj.display1();
    }
}