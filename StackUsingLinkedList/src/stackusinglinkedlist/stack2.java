

package stackusinglinkedlist;

public class stack2<T>
{
    class node
    {
        T data;
        node next;
        
        public node(T value)
        {
            this.data=value;
        }
    }
    
    node top=null;
    int size=0;
    
   public boolean isEmpty()
   {
       return (top==null);
   }
   
   public void push( T value)
   {
           node n=new node(value);
          n.next=top;
          top=n;
          size++;    
       
   }
   
   public T pop()
   {
        if(isEmpty())
        {
       System.out.println("Stack is Empty");
       return null;
        }
        
        else
        {
           T value=top.data;
           top=top.next;
           size--;
           return value;
            
        }
   }
   
   public T peek()
   {
       if (isEmpty())
           return null;
       
       else
       {
           return top.data;
       }
   }
   
   public int size()
   {
       return size;
   }
    
}
