/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackusinglinkedlist;

import java.util.Stack;

/**
 *
 * @author My University
 */
public class stack<T>
{

    Stack<Integer> st=new Stack<>();
private T arr[]=(T[])new Object[10];

private int top=-1;

private boolean isEmpty()
{
    return (top<=-1);
}

private boolean isFull()
{
    return (top>=arr.length-1);
}
    
public void push(T value)
{
    if(isFull())
        System.out.println("The Stack is full");
    
    else
    {
        arr[++top]=value;
    }
}

public T pop()
{
    if(isEmpty())
    {
        System.out.println("The stack is Empty");
    return null;
    }
    
    else
    {
        T value=arr[top--];
        return value;
}
}

  public int size()
    {
        return top+1;
}
  
  public T peak()
  {
      if(isEmpty())
          return null;
      
      else
          return arr[top];  }
}