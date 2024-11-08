/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlisttest;

/**
 *
 * @author My University
 */
public class circularLinkedList<T>
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
    
    public boolean isEmpty()
    {
        return start==null;
    }
    
    public void insertAtStart(T value)
    {
        node n=new node(value);
        if(isEmpty())
        {
            
          n.next=n.pre=n;
          start=n;
        }
        
        else
        {
            n.next=start;
            n.pre=start.pre;
            start.pre.next=n;
            start=n;
            
            
        }
    }
    
    public void insertAtEnd(T value)
    {
        node n=new node (value);
        
     if(isEmpty())
     {
         n.next=n;
         n.pre=n;
         start=n;
     }
        
     else
     {
     
         
         n.next=start;
         n.pre=start.pre;
         start.pre.next=n;
         start.pre=n;
         
     }
     
    }
    
    
    public T deleteAtStart()
    {
        if(isEmpty())
            return null;
        
        else if(start.pre==start.next)
                {
                    T data=start.data;
                    start=null;
                    return data;
                }
        else
        {
            T data=start.data;
            start.next.pre=start.pre;
            start.pre.next=start.next;
            start=start.next;
            return data;
            
        }
        
    }
    
    public T deleteAtEnd()
    {
        if(isEmpty())
            return null;
    
    else if(start.pre==start.next)
                {
                    T data=start.data;
                    start=null;
                    return data;
                }
    else 
    {
     T data=start.pre.data;
     
     
     start.pre=start.pre.pre;
     start.pre.pre.next=start;
     
     return data;
    }
}
}

