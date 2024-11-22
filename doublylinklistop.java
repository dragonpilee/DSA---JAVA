import java.io.*;
class node
{
    int info;
    node next,prev;
}
class Linkedlist
{
    node start,last;
    Linkedlist()
    {
        start=null;
        last=null;
    }
    void insertb()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        node p=new node();
        node ptr;
        System.out.println("Enter the new value:");
        int item=Integer.parseInt(in.readLine());
        p.info=item;
        if(start==null)
        {
            start=last=p;
            p.prev=null;
            p.next=null;
        }
        else
        {
           p.prev=null;
           p.next=start;
           start.prev=p;
           start=p;
        }
        System.out.println("Successfully inserted");
    }
    void inserte()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        node p=new node();
        node ptr;
        System.out.println("Enter the value:");
        int val=Integer.parseInt(in.readLine());
        p.info=val;
        if(start==null)
        {
            start=last=p;
            p.prev=null;
            p.next=null;
        }
        else
        {
            p.prev=last;
            p.next=null;
            last.next=p;
            last=p;
        }
        System.out.println("Successfully inserted");
    }
    void delete()throws IOException
    {
        node ptr,pre=null;
        if(start==null)
        System.out.println("List is Empty");
        else
        {
            ptr=last;
            int item=last.info;
            last =last.prev;
            if(last==null)
            start=null;
            else
            last.next=null;
            item=ptr.info;
            System.out.println("Deleted Successfully"+item);
        }
    }
    void displayforward()
    {
        node ptr;
        if(start==null)
        System.out.println("List is Empty");
        else
        {
            System.out.println("\nList elements are:");
            for(ptr=start;ptr!=null;ptr=ptr.next)
            System.out.print(ptr.info+"---->");
            System.out.print("null");
        }
    }
    void displaybackward()
    {
        node ptr;
        if(start==null)
        System.out.println("List is empty");
        else
        {
            System.out.print("\nList elements are:");
            for(ptr=last;ptr!=null;ptr=ptr.prev)
            System.out.print(ptr.info+"---->");
            System.out.print("null");
        }
    }
}
class doublylinklistop
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        int ch;
        Linkedlist st=new Linkedlist();
        do
        {
            System.out.println("\n1.Insert into the begining\n2.Displayforward\n3.Insert@end\n4.Display Backward\n5.Delete last node\n6.Exit");
            System.out.println("Enter your choice:");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:st.insertb();
                       break;
                case 2:st.displayforward();
                       break;
                case 3:st.inserte();
                       break;
                case 4:st.displaybackward();
                       break;
                case 5:st.delete();
                       break;
                case 6:System.out.println("Exiting from program");
                       break;
                default:System.out.println("Invalid choice!");
            }
        }
        while(ch!=6);
    }
}