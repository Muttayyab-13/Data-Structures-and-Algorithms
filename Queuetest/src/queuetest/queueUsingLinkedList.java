

package queuetest;


public class queueUsingLinkedList<T>
{
    
    class node
    {
        T data;
        node next;
        node pre;
        
        public node(T value)
        {
            this.data=value;
        }
    }
    
    node start=null;
    node end=null;
    
    
    public boolean isEmpty()
    {
        return start==null;
    }
    
    public void enQueue(T value)
    {
        node n=new node(value);
        if(isEmpty())
        {
            start=end=n;
        }
        
        else
        {
            end.next=n;
            n.pre=end;
            n.next=null;
            end=n;
        }
    }
    

    
}
