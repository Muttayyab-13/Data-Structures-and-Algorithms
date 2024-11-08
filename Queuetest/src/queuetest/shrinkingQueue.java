/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuetest;

/**
 *
 * @author My University
 */
public class shrinkingQueue<T>
{

    T[] arr = (T[]) new Object[10];

    int head = 0;
    int tail = -1;

    public boolean isEmpty()
    {
        return (tail <= -1 || head >= arr.length - 1);
    }

    public boolean isFull()
    {
        return (tail >= arr.length - 1);
    }

    public T front()
    {
        if (isEmpty())
        {
            return null;
        } 
        else
        {
            return arr[head];
        }
    }

    public void enQueue(T value)
    {
        if (isFull())
        {
            System.out.printf("Dropped" + value);
        } 
        else
        {
            arr[++tail] = value;
        }
    }
    
    public T deQueue()
    {
        if(isEmpty())
            return null;
        
        else
        {
            T value=arr[head++];
            return value;
        }
    }
    
    public int size()
    {
        return (tail-head)+1;
    }
}
