package stack.basic;

//Completed GFG - correct
public class StackUsingArray
{
    int top;
    int arr[] = new int[1000];

    StackUsingArray()
    {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a)
    {
        if(top == arr.length)
            return;
        else
            arr[++top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        if(top == -1)
            return -1;
        else
            return arr[top--];
    }
    void display()
    {
        while (top >= 0)
        {
            System.out.print(arr[top--]);
        }
    }

    public static void main(String[] args)
    {
        StackUsingArray stack = new StackUsingArray();
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.pop();

        stack.display();
    }
}
