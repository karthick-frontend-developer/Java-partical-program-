import java.util.*;

class Node

{

int data;

Node next;

Node(int data)

{

this.data=data;                                  

this.next=null;

}

}

class StackLinkedlist

{

private Node top;

public StackLinkedlist ()

{

this.top=null;

}

public void push(int data)

{

Node newNode=new Node(data);

newNode.next=top;

top=newNode;

}

public void pop()

{

if(isEmpty())

{

System.out.println("Stack is empty");

}

else

{

int poppedData=top.data;

top=top.next;

System.out.println("Popped element is:"+poppedData);

}

}

public boolean isEmpty()

{

return top==null;

}

public void display()

{

if(isEmpty())

{

System.out.println("stack is empty");                  

return;

}

Node current=top;

while(current!=null)

{

System.out.print(current.data+ " ");

current=current.next;

}

System.out.println();

}

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

StackLinkedlist stack=new StackLinkedlist();

System.out.println("1.PUSH");

System.out.println("2.POP");

System.out.println("3.DISPLAY");

System.out.println("4.EXIT");

while(true)

{

System.out.println("Enter your choice:");

int choice=sc.nextInt();

switch(choice)

{

case 1:

System.out.println("Enter value to push into stack");

int value=sc.nextInt();

stack.push(value);

break;

case 2:

stack.pop();

break;

case 3:

stack.display();

break;

case 4:

System.out.println("exiting");

sc.close();

return;

default:

System.out.println("inavlid choice please try again");

}

}

}

}
