import java.io.*;
class node
{
    int info;
    node next,prev;
}
class Link
{
    node start,last;
    void Link()
    {
        start=null;
        last=null;
    }
    void insertend()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        node p=new node();
        node ptr;
        System.out.println("Enter the values:");
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
    void deletefront()throws IOException
    {
        if(start==null)
        System.out.println("List is Empty");
        else
        {
            node ptr;
            int item=start.info;
            ptr=start;
            start =start.next;
            if(start==null)
            last=null;
            else
            start.prev=null;
            System.out.println("Deleted Successfully: "+item);
        }
    }
    public void display()
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
}
class linkedqueoper
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        int ch;
        Link st=new Link();
        do
        {
            System.out.println("\n1.Insert into the end\n2.Delete first\n3.Display\n4.Exit");
            System.out.println("Enter your choice:");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:st.insertend();
                       break;
                case 2:st.deletefront();
                       break;
                case 3:st.display();
                       break;
                case 4:System.out.println("Exited from program");
                       break;
                default:System.out.println("Invalid choice!");
            }
        }
        while(ch!=4);
    }
}