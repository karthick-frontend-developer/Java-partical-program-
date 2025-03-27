import java.util.*;

public class StackArray

{

private int max;

private int[] st;

private int top;

public StackArray(int size)

  {

        max = size;

        st = new int[max];

        top = -1;

    }

public void push (int value)

  {

    if (top == max - 1) 

        {

    System.out.println("Stack overflow");

    return;

        }

st [++top] = value;

System.out.println(value + " pushed into the stack");

    }

public int pop() 

      {

if (top == -1) 

        {

System.out.println("Stack underflow");

return -1;

        }

int popelement = st [top--];

System.out.println(popelement + " popped from the stack");

return popelement;

    }

public void display ()   {  

System.out.println("Printing stack elements .....");  

    if(top == -1)
    {
        System.out.println("Stack is empty");
    }
    else 
    {
        for(int i = top; i>=0;i--)  

       {             System.out.println(st[i]);         

       }  
    }

   }  

public static void main(String[] args)

       {

        Scanner scanner = new Scanner(System.in);

System.out.println(" Enter the limit : ");

int n = scanner.nextInt();

StackArray stk = new StackArray(n);

while (true) 

        {

System.out.println("1. PUSH");

System.out.println("2. POP");

System.out.println("3. Display");

System.out.println("4. Exit");

System.out.print("Enter your choice: ");

int choice = scanner.nextInt();

switch (choice) 

            {

case 1:

System.out.print("Enter value to push into the stack: ");

int value = scanner.nextInt();

stk.push(value);

break;

case 2:

stk.pop();

break;

case 3:

stk.display();

break;

case 4:

System.out.println("Exiting...");

scanner.close();

return;

default:

System.out.println("Invalid choice. Please try again.");

   }

   }

   }

   }
