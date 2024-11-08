
package slldemo;

public class SinglyLinkedList
{
    class Node
    {
        int data;
        Node next;
    }
    
    Node start = null;
   
    
    private boolean isEmpty()
    {
        if(start == null)
            return true;
        return false;
    }
    
    public void insertAtEnd(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = null;
        
        if(isEmpty())
            start = n;
        else
        {
            Node t = start;
            while(t.next != null)
                t = t.next;
            t.next = n;
        }
    }
    
    public void insertAtStart(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = start;
        start = n;
    }
    
    public void traverse()
    {
        if(isEmpty())
            System.out.println("List is Empty");
        else
        {
            Node t = start;
            while(t != null)
            {
                System.out.print(t.data+ " -> ");
                t = t.next;
            }
            System.out.println(" null");
        }
    }
    
    public boolean search(int key)
    {
        if(isEmpty())
            return false;
        else
        {
            Node t = start;
            while(t != null)
            {
                if(t.data == key)
                    return true;
                t = t.next;
            }
            return false;
        }
    }
    
    private Node searchNode(int key)
    {
        if(isEmpty())
            return null;
        else
        {
            Node t = start;
            while(t != null)
            {
                if(t.data == key)
                    return t;
                t = t.next;
            }
            return null;
        }
    }
}
