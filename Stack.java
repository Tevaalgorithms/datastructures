package stack_qu2;
 /**
 *
 * @author teva
 */
public class MyStack
{
    private Node top;
    
    private static class Node
    {
        private int d;
        private Node next;       
       
        Node(int data)
        {
            this.d = data;
            this.next = null;
        }
    }
    public boolean isEmpty()
    {
        return top == null;
    }
    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;       
    }
    public int peek()
    {
        return top.d;
    }
    
    public int pop()
    {
        int d = top.d;
        top = top.next;
        return d;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);
        
        System.out.print("Peek element " + newStack.peek() + "\n");
        
        System.out.print("Pop element " + newStack.pop() + "\n");
        
        System.out.print("Peek element after pop " + newStack.peek() + "\n");
        
        newStack.push(100);
        
        System.out.print("Peek element after push " + newStack.peek() + "\n");
    }
    
}
