

package queuetest;


public class nonShrinkingQueue<T>
{
    
 T[] arr=(T[])new Object[10];
 
 int head;
 int tail;
 
 public boolean isEmpty()
 {
     return (tail<=-1); 
    
 }
 
 public boolean isFull()
 {
     return (tail>=arr.length-1);
 }
 
 
 public void enQueue(T value)
 {
     if(isFull())
         System.out.println("Value Dropped"+ value);
     
     else 
     {
        arr[++tail]=value;     
     }
 }
 
 public T deQueue()
 {
  if(isEmpty())
      return null;
  
  else
  {
      T value =arr[head];
      moveForward();
      return value;
              
  }
 }
 
 public int size()
 {
     return (tail+1);
 }
 
 
 
private void moveForward()
{
for(int i=1 ;i<=tail;i++)
{
    arr[i-1]=arr[i];
} 
tail--;

}

}