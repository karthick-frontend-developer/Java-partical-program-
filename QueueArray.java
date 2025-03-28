import java.util.*;
public class QueueArray
{
    private int capcity;
    private int fornt,rear;
    private int []queue;

    public QueueArray(int size) {
        fornt = rear = 0;
        capcity = size;
        queue = new int [capcity];
    }
    public void enqueue(int v)
    {
        if(rear == capcity)
        {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++]= v;
        System.out.println(v+" is pushed into the Queue");
    }
    public void dequeue()
    {
        if(fornt == rear)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[fornt++]+" is popped out of the Queue");
    }
    public void display()
    {
        if(fornt == rear)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("printing element in Queue.....");
        for (int i = fornt;i<rear;i++) {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of queue :");
        int n = sc.nextInt();
        QueueArray q = new QueueArray(n);
        System.out.println("1.ENQUEUE 2.DEQUEUE 3.DISPLAY 4.EXIT");
        while (true) { 
            System.out.println("Enter your choice :");
            int c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter a value to add into queue :");
                    int v = sc.nextInt();
                    q.enqueue(v);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
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
