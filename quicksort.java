import java.io.DataInputStream;
class quicksort
{
    public static void main(String args[])
    {
    DataInputStream in =new DataInputStream(System.in);
    int i;
    int[] arr=new int[10];
    int n;
    n=0;
    try 
    {
        System.out.println("Enter the number of elements:");
        n=Integer.parseInt(in.readLine());
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }   
    } 
    catch (Exception e) 
    {
        System.out.println("Error");
    }
    System.out.println("\n The array is:\n");
    for(i=0;i<n;i++)
    System.out.println(arr[i]);
    quicksort(arr,0,n-1);
    System.out.println("\n The sorted array is:\n");
    for(i=0;i<n;i++)
    System.out.println(arr[i]);
}
public static void quicksort(int a[],int low,int high)
{
    int temp;
    int i,j,key;
    if(low<high)
    {
        key=a[low];
        i=low+1;
        j=high;
        do
        {
            while(a[i]<=key&&i<high)
            i=i+1;
            while(a[j]>key)
            j=j-1;
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        while(i<j);
        temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        quicksort(a,low,j-1);
        quicksort(a,j+1,high);
    }
  }
}