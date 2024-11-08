/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuetest;

/**
 *
 * @author My University
 */
public class priorityQueue<T>
{
    
    shrinkingQueue<T> vHigh=new shrinkingQueue<>();
    shrinkingQueue<T> high=new shrinkingQueue<>();  
    shrinkingQueue<T> med=new shrinkingQueue<>(); 
    shrinkingQueue<T> low=new shrinkingQueue<>();
      
      
    public void enQueue(T value,int priority)
    {
        if(priority++==0 && !vHigh.isFull())
            vHigh.enQueue(value);
        else if(priority==1)
            high.enQueue(value);
        else if(priority==2)
            med.enQueue(value);
        else
            low.enQueue(value);
    }
    
    public T deQueue()
    {
     if(!vHigh.isEmpty())   
         return vHigh.deQueue();
     
     else if(!high.isEmpty())
            return high.deQueue();
        else if(!med.isEmpty())
            return med.deQueue();
        else
            return low.deQueue();
    }
   
    
}
