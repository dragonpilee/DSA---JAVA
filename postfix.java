import java.io.*;
import java.util.Stack;
class postfix
{
    public static void main(String args[])throws Exception
    {
        String exp;
        char op;
        int d=0,a,b;
        Stack<Integer>st=new Stack<>();
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter the postfix expression:");
        exp=in.readLine();
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            switch(c)
            {
                case '+':a=st.pop();
                         b=st.pop();
                         st.push(b+a);
                         break;
                case '-':a=st.pop();
                         b=st.pop();
                         st.push(b-a);
                         break;
                case '*':a=st.pop();
                         b=st.pop();
                         st.push(b*a);
                         break;
                case '/':a=st.pop();
                         b=st.pop();
                         st.push(b/a);
                         break;
                case '^':a=st.pop();
                         b=st.pop();
                         st.push(b^a);
                         break;
                case ' ':if(d!=0)
                          {
                            st.push(d);
                            d=0;
                          }
                          break;
                default:d=d*10+(c-'0');
                        break;
            
            }
        }
        System.out.println(st.pop());
    }
}