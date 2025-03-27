import java.util.*;

class Node

{

int data;

Node next;

public Node(int data)

{

this.data=data;

this.next=null;

}

}

public class LinkedlistQueue

{

private Node front,rear;

public LinkedlistQueue()

{

this.front=this.rear=null;

}

public void enqueue(int data)

{

Node newNode=new Node(data);

if(this.rear==null)

{

this.front=this.rear=newNode;

return;

}

this.rear.next=newNode;

this.rear=newNode;

}

public void dequeue()

{

if(this.front==null)

{

System.out.println("queue is empty");

}

System.out.println("Elements removed after Deletion");

Node temp=this.front;

this.front=this.front.next;

if(this.front==null)

{

this.rear=null;

}

System.out.println(temp.data);

}

public boolean isEmpty()

{

return this.front==null;

}

public void display()

{

if(this.front==null)

{

System.out.println("queue is Empty");

}

Node Current=front;

System.out.println("Elements in queue");

while (Current!=null)

{

System.out.println(Current.data);

Current=Current.next;

}

System.out.println();

}

public static void main(String[] args)

{

LinkedlistQueue queue=new LinkedlistQueue();

Scanner sc =new Scanner(System.in);

System.out.println("Queue implementation using LinkedList");

System.out.println("1.ENQUEUE");

System.out.println("2.DEQUEUE");

System.out.println("3.DISPLAY");

System.out.println("4.EXIT");

while(true)

{

System.out.println("Enter your choice:");

int  choice=sc.nextInt();

switch(choice)

{

case 1:

System.out.println("Enter value to add Queue");

int value=sc.nextInt();

queue.enqueue(value);

break;

case 2:

queue.dequeue();

break;

case 3:

queue.display();

break;

case 4:

System.out.println("exiting");

sc.close();

return;

default:

System.out.println("Inavlid choice please try again");

}

}

}

}
