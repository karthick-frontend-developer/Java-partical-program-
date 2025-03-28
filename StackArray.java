import java.util.*;
public class StackArray
{
    private int max;
    private int top;
    private int []st;

    public StackArray(int size) {
        max = size;
        st = new int[max];
        top = -1;
    }
    public void push(int v)
    {
        if(top ==max - 1)
        {
            System.out.println("Stack overflow");
            return;
        }
        st[++top] = v;
        System.out.println(v+" is pushed into the stack");
    }
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("stack underflow");
            return;
        }
        System.out.println(st[top--]+" is popped out of the stack");
    }
    public void display()
    {
        if(top == -1)
        {
            System.out.println("stack is underflow");
            return;
        }
        System.out.println("printing element in stack.....");
        for (int i = top;i>=0;i--) {
            System.out.println(st[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of stack :");
        int n = sc.nextInt();
        StackArray stk = new StackArray(n);
        System.out.println("1.PUSH 2.POP 3.DISPLAY 4.EXIT");
        while (true) { 
            System.out.println("Enter your choice :");
            int c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter a value to push into stack :");
                    int v = sc.nextInt();
                    stk.push(v);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    System.out.println("Exiting......");
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}
