public class Stack 
{
    private static class Node
    {
        private final int data;
        private Node next;
        
        private Node(int d)
        {
            this.data = d;
            this.next = null;
        }
        private Node top;
        
        public boolean isEmpty()
        {
            return top == null;
        }
        
        public int peek()
        {
            if(top == null) return -1;
            else
                return top.data;
        }
        
        public void push(int d)
        {
            Node n = new Node(d);
            n.next = top;
            top = n;
        }
        
        public int pop()
        {
            if(top == null) return -1;
            int d = top.data;
            top = top.next;
            return d;                
        }
        
        public void print(Node n)
        {
            while(n.next != null)
            {
                System.out.println(n.data); 
                n = n.next;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Node s1 = new Node(10);
        Node s2 = new Node(20);
        Node s3 = new Node(30);
        Node s4 = new Node(40);
        Node s5 = new Node(50);
        
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        
        s1.print(s1);
        
        s1.push(100);
        
        System.out.println("Peek Value " + s1.peek());
        
        System.out.println("pop Value " + s1.pop());
        
        s1.print(s1);      
                
    }    
}
