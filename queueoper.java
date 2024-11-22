import java.io.*;
class queue
{
    int a[],front,rear,n;
    DataInputStream in=new DataInputStream(System.in);
    queue()throws IOException
    {
        front=-1;
        rear=-1;
        System.out.println("Enter size of the queue:");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
    }
    void insert()throws IOException
    {
        if(rear==(n-1))
        System.out.println("overflow");
        else
        {
            System.out.println("Enter the new value");
            int item=Integer.parseInt(in.readLine());
            rear=rear+1;
            a[rear]=item;
            if(front==-1)
            front=front+1;
            System.out.println("successfully inserted");
        }
    }
    void delete()
    {
        if(front==-1)
        System.out.println("underflow");
        else
        {
            int item=a[front];
            front=front+1;
            if(front>rear)
            {
                front=-1;
                rear=-1;
            }
            System.out.println("Successfully deleted no:"+item);
        }
    }
    void display()
    {
        if(front==-1)
        System.out.println("queue is empty");
        else
        {
            System.out.println("current queue is:");
            for(int i=front;i<=rear;i++)
            System.out.println(""+a[i]);
        }
    }
}
class queueoper
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        int ch;
        queue q=new queue();
        do
        {
            System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.println("Enter your choice");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:q.insert();
                       break;
                case 2:q.delete();
                       break;
                case 3:q.display();
                       break;
                case 4:System.out.println("Exited from program");
                       break;
                default:System.out.println("Invalid Choice!");
            }
        }
        while(ch!=4);
    }
}