import java.io.DataInputStream;
class isort
{
    int a[],n;
    void getdata()throws Exception
    {
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter number of elements:");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
    }
    void display()
    {
        System.out.println("\n The array is :\n");
        for(int i=0;i<n;i++)
         System.out.println(a[i]);
    }
    void display1()
    {
      System.out.println("\n The sorted array is:\n");
      for(int i=0;i<n;i++)
        System.out.println(a[i]);

    }
    void sort()
    {
        insertion();
    }
    void insertion()
    {
        for(int k=1;k<n;k++)
        {
            int temp=a[k];
            int ptr=k-1;
            while(ptr>=0 && temp<a[ptr])
            {
                a[ptr+1]=a[ptr];
                ptr=ptr-1;
            }
            a[ptr+1]=temp;
        }
    }
}
class insort
{
    public static void main(String args[]) throws Exception
    {
        isort obj= new isort();
        obj.getdata();
        obj.display();
        obj.sort();
        obj.display1();
    }
}