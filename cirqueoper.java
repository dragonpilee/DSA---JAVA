import java.io.*;
import java.awt.*;
class cirque
{
    int a[],front,rear,n;
    DataInputStream in= new DataInputStream(System.in);
    cirque() throws IOException
    {
        front=-1;
        rear=-1;
        System.out.println("enter size of the circularque:");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
    }
    void insert() throws IOException
    {
        if(front==(rear+1)%n)
        System.out.println("overflow");
        else
        {
            System.out.println("enter the new value");
            int item=Integer.parseInt(in.readLine());
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%n;
            a[rear]=item;
        }
    }
    void delete()
    {
        if(front==-1)
        System.out.println("underflow");
        else{
         int item=a[front];
         if(front==rear)
         {
            front=-1;
            rear=-1;
         }
         else
         front=(front+1)%n;
        }
    }
    void display()
    {
        if(front==-1)
        System.out.println("circular que is empty");
        else
        {
            System.out.println("current circularque is:");
            if(front>rear)
            {
                for(int i=front;i<n;i++)
                 System.out.println(" "+a[i]);
                 for(int i=0;i<=rear;i++)
                 System.out.println(" "+a[i]);
            }
            else
            {
                for(int i=front;i<=rear;i++)
                System.out.println(" "+a[i]);
            }
        }
    }
 }
class cirqueoper
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        int ch;
        cirque s=new cirque();
        do
        {
          System.out.println("1.insert\n2.delete\n3.display\n4.exit");
          System.out.println("Enter your choice");
          ch=Integer.parseInt(in.readLine());
          switch(ch)
          {
            case 1:s.insert();
                       break;
                case 2:s.delete();
                       break;
                case 3:s.display();
                       break;
                case 4:System.out.println("exit from program");
                       break;
                default:System.out.println("invalid choice");
                break;
          }
        }while(ch!=4);
    }
}