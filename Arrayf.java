import java.io.DataInputStream;
class Arrayfun
{
    int a[]=new int[10];
    int n;
    DataInputStream in = new DataInputStream(System.in);
    void create_array()
    {
        try
        {
            System.out.println("Enter number of elemets:");
            n=Integer.parseInt(in.readLine());
            System.out.println("enter elemts:");
             for(int i=0;i<n;i++)
              a[i]=Integer.parseInt(in.readLine());
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }
    void insert()
     {
        int k,item;
        k=0;
        item=0;
        try
        {
            System.out.println("enterk:");
            k=Integer.parseInt(in.readLine());
            System.out.println("enter item");
            item=Integer.parseInt(in.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        if(k<=n)
        {
            for(int i=n-1;i>=k;i--)
             a[i+1]=a[i];
             a[k]=item;
             n=n+1;
             System.out.println("inserted successfully");
        }
        else
        System.out.println("Cannot insert");
      }
     void delete()
      {
        int k,item;
        k=0;
        item=0;
        try
        {
            System.out.println("enterk:");
            k=Integer.parseInt(in.readLine());
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        item=a[k];
        if(k<n)
         {
            for(int i=k;i<n-1;i++)
             a[i]=a[i+1];
             a[k]=item;
             n=n-1;
             System.out.println("deleted successfully,item="+item);
         }
         else
         System.out.println("cannot delete");
      }
      void display()
      {
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
      }
      void search()
      {
        int s,i,l;
        s=0;
        l=-1;
        try
         {
            System.out.println("enter element to be searched:");
            s=Integer.parseInt(in.readLine());
         }
         catch (Exception e)
         {

         }
         for(i=0;i<n;i++)
         {
            if(a[i]==s)
            {
                System.out.println("element found ,location="+i);
                l=i;
                break;
            }
         }
         if(l==-1)
         {
            System.out.println("element not found");
         }
      }
 }

      class Arrayf
      {
        public static void main(String args[])
        {
            DataInputStream in = new DataInputStream(System.in);
            Arrayfun s = new Arrayfun();
            s.create_array();
            int ch;
            ch=0;
            do
            {
                System.out.println("select your choice:");
                System.out.println("1.Insert");
                System.out.println("2.Delete");
                System.out.println("3.Display");
                System.out.println("4.Search");
                System.out.println("5.Exit");
                try
                {
                  System.out.println("Enter choice: ");
                  ch=Integer.parseInt(in.readLine());
                }
                catch(Exception e)
                {

                }
             switch(ch)
              {
                case 1:s.insert();
                       break;
                case 2:s.delete();
                       break;
                case 3:s.display();
                       break;
                case 4:s.search();
                       break;
                case 5:
                       break;
                default:System.out.println("wrong choice");
                break;
               }
            } while(ch!=5);
        }
      }