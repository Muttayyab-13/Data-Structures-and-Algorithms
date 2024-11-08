
package queuetest;


public class circularQueue<T>
{
    T[]arr=(T[])new Object();
    
    int tail=0;
    int head=0;
    int n=arr.length;
    
    public boolean isEmpty()
    {
        return (tail==head);
    }
    
    public boolean isFull()
    {
        return (tail-head==n);
    }
    
    public void enQueue(T value)
    {
        if(isFull())
            System.out.println("value Dropped"+value);
        
        else
        {
            arr[tail++%n]=value;
        }
    }
    
    public T deQueue()
    {
        if(isEmpty())
            return null;
        
        else
        {
            T value=arr[head++%n];
            return value;
        }
    }
    
    public T front()
    {
        return arr[head%n];
    }
    
    public int size()
    {
        return (tail-head);
    }
    
    public void transverse()
    {
    for(int i=(head%n);i<=i+(tail-head);i++)
    {
        
    }
    }
    
}
