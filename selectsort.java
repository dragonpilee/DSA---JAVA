import java.io.DataInputStream;
class selection
{
    int a[],n;
    void getdata()throws Exception
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter the number of elements:");
        n=Integer.parseInt(in.readLine());
        a=new int[100];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
    }
    void display()
    {
        System.out.println("\n The array is:\n");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
    void display1()
    {
        System.out.println("\n The sorted array is :\n");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
    void sort()
    {
        selection();
    }
    void selection()
    {
        for(int k=0;k<n;k++)
        {
            int min=a[k];
            int loc=k;
            for(int j=k+1;j<n;j++)
            {
                if(min>a[j])
                {
                    min=a[j];
                    loc=j;
                }
            }
            int temp=a[k];
            a[k]=a[loc];
            a[loc]=temp;
        }
    }
}
class selectsort
{
    public static void main(String args[])throws Exception
    {
        selection obj=new selection();
        obj.getdata();
        obj.display();
        obj.sort();
        obj.display();
    }
}              