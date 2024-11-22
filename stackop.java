import java.io.*;
class stack
{
    int a[],top,n;
    DataInputStream in=new DataInputStream(System.in);
    stack()throws IOException
    {
        top=-1;
        System.out.println("Enter the size of stack:");
        n=Integer.parseInt(in.readLine());
        a=new int[n];
    }
    void push()throws IOException
    {
        if(top==n-1)
        System.out.println("OverFlow");
        else 
        {
            System.out.println("Enter the new value:");
            int item=Integer.parseInt(in.readLine());
            top++;
            a[top]=item;
            System.out.println("Successfully pushed");
        }
    }
    void pop()
    {
        if(top==-1)
         System.out.println("Underflow");
         else
         {
           int item=a[top];
           top--;
           System.out.println("Successfully pop"+item);
         }
    }
    void display()
    {
        if(top==-1)
         System.out.println("Stack is Empty");
        else
        {
            System.out.println("Current Stack is:");
            for(int i=top;i>=0;i--)
            System.out.println(""+a[i]);
        }
    }
}
class stackop
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        int ch;
        stack obj=new stack();
        do
        {
          System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
          System.out.println("Enter your choice:");
          ch=Integer.parseInt(in.readLine());
          switch(ch)
          {
            case 1:obj.push();
                   break;
            case 2:obj.pop();
                   break;
            case 3:obj.display();
                   break;
            case 4:System.out.println("Exit from program");
                   break;
            default:System.out.println("invalid choice");
          }
        }while(ch!=4);
    }
}