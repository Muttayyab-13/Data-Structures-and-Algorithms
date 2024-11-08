/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuetest;

/**
 *
 * @author My University
 */
public class DEQueue<T>
{
    T[]arr=(T[])new Object[5];
    
    int head=0;
    int tail=-1;
    int n=arr.length;
    
    public boolean isEmpty()
    {
        return (tail<=-1);
    }
    
    public boolean isFull()
    {
        return (tail>=n-1);
    }
    
    public void enQueue_at_tail(T value)
    {
        if(isFull())
            System.out.println("Queuen is full");
        
        else 
        {
            arr[++tail]=value;
        }
    }
    
    public void enQueue_at_head(T value)
    {
        if(isFull())
            System.out.println("Queue is Full");
        
        else
        {
         moveBack();
         arr[++tail]=value;
        }
    }

    public T deQue_at_head()
    {
        if(isEmpty())
            return null;
        
        else
        {
           T value=arr[head++];
           moveForward();
           return value;
        }
        
    }
    
    public T deQue_at_tail()
    {
        if(isEmpty())
            return null;
        
        else
        {
            T value=arr[tail--];
            return value;
        }
    }
    
    private void moveBack()
    {
        for(int i=tail;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
    }
     private void moveForward()
    {
        for(int i=1;i<=tail;i++)
        {
            arr[i-1]=arr[i];
        }
        tail--;
    }
    
    
}
