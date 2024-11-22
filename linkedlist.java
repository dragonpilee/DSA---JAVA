import java.io.*;
class node
{
    int info;
    node next;   
}
class nnode
{
    int item;
    node start,ptr;
    DataInputStream in=new DataInputStream(System.in);
    nnode()throws IOException
    {
        start = null;
    }
    void insert1()throws IOException
    {
        System.out.println("Enter the number to be inserted:");
        item=Integer.parseInt(in.readLine());
        node p = new node();
        p.info=item;
        p.next=start;
        start=p;
        System.out.println("successfully inserted:"+item);
    }
    void insert2()throws IOException
    {
        System.out.println("Enter the item to be inserted:");
        item=Integer.parseInt(in.readLine());
        node p = new node();
        p.info=item;
        if(start==null)
        {
            start=p;
        }
        else
        {
            ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=p;
        }
        p.next=null;
        System.out.println("Successfully inserted:"+item);
    }
    void insert3()throws IOException
    {
        node loc;
        int k;
        System.out.println("Enter number to be inserted: ");
        item=Integer.parseInt(in.readLine());
        node p=new node();
        p.info=item;
        System.out.println("enter the location:");
        int i=Integer.parseInt(in.readLine());
        if(start==null||i==0)
        {
            p.next=start;
            start=p;
        }
        else
        {
            for(k=1,loc=start;k<1;k++)
            {
                loc=loc.next;
                if(loc==null)
                {
                    System.out.println("invalid location and insertion not possible");
                    return;
                }
            }
          p.next=loc.next;
          loc.next=p;
        }
        System.out.println("Successfully inserted"+item);
    }
    void delete1()throws IOException
    {
        node p=new node();
        if(start==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            ptr=start;
            start=start.next;
        }
        item=ptr.info;
        System.out.println("successfully Deleted:"+item);
    }
    void delete2()throws IOException
    {
        node p=new node();
        node prev=null;
        if(start==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            for(ptr=start;ptr.next!=null;ptr=ptr.next)
             prev=ptr;
             if(ptr==start)
             {
                start=null;
             }
             else
             {
                prev.next=null;
             }
             item=ptr.info;
             System.out.println("successfully Deleted:"+item);
        }
    }
    void delete3()throws IOException
    {
        node p=new node();
        ptr=start;
        node loc=ptr;
        if(start==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("enter the number to be deleted:");
            item=Integer.parseInt(in.readLine());
            for(ptr=start;ptr!=null;ptr=ptr.next)
            {
                if(ptr.info==item)
                {
                    if(ptr==start)
                    start=start.next;
                    else
                    loc.next=ptr.next;
                    System.out.println("Successfully Deleted:"+item+"\n");
                    System.out.println("List after Deletion\n");
                    traverse();
                    return;
                }
                loc=ptr;
            }
            System.out.println("Element is not in the list");
        }
    }
    void traverse()throws IOException
    {
        if(start==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            System.out.println("The linked list is");
            for(ptr=start;ptr!=null;ptr=ptr.next)
            {
                System.out.println(ptr.info+"--->");
            }
            System.out.println("Null");
        }
    }
}
class linkedlist
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in= new DataInputStream(System.in);
        int ch;
        nnode n=new nnode();
        do
        {
            System.out.println("\n1:Insert at beginning");
            System.out.println("\n2:Insert at end");
            System.out.println("\n3:nsert at a given position");
            System.out.println("\n4:Delete from beginning");
            System.out.println("\n5:Delete from end");
            System.out.println("\n6:Delete a given element");
            System.out.println("\n7:Traverse");
            System.out.println("\n8:Exit");
            System.out.println("Enter your choice");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:n.insert1();
                       System.out.println("\nlist after insertion\n");
                       n.traverse();
                       break;
                case 2:n.insert2();
                       System.out.println("\nlist after insertion\n");
                       n.traverse();
                       break;
                case 3:n.insert3();
                       System.out.println("\nlist after insertion\n");
                       n.traverse();
                       break;
                case 4:n.delete1();
                       System.out.println("\nlist after deletion\n");
                       n.traverse();
                       break;
                case 5:n.delete2();
                       System.out.println("\nlist after deletion\n");
                       n.traverse();
                       break;
                case 6:n.delete3();
                       break;
                case 7:n.traverse();
                       break;
                case 8:System.out.println("Exited from program");
                       break;
                default:System.out.println("invalid choice!");
            }
        }while(ch!=8);
    }
}