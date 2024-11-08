
package linkedlisttest;

public class link_List<T>
{

    class node
    {

        node next;
        T data;
    }

    node start = null;

    public boolean isEmpty()
    {
        return start == null;
    }

    public void insertAtEnd(T value)
    {
        node n = new node();
        n.data = value;
        n.next = null;

        if (isEmpty())
        {
            start = n;
        } else
        {
            node t = start;
            while (t.next != null)
            {
                t = t.next;
            }
            t.next = n;
        }

    }

    public void insertAtStart(T value)
    {
        node n = new node();
        n.data = value;
        n.next = start;
        start = n;
    }

    public void transverse()
    {
        if (isEmpty())
        {
            System.out.println("List is Empty");
        } else
        {
            node temp = start;
            while (temp != null)
            {
                System.out.printf(temp.data + "----->");
                temp = temp.next;
            }
            System.out.printf("Null");
        }

    }

    public boolean Search(T key)
    {
        if (isEmpty())
        {
            return false;
        } else
        {
            node t = start;
            while (t != null)
            {
                if (t.data == key)
                {
                    return true;
                }
                t = t.next;

            }
            return false;
        }
    }

    public node search_Node(T key)
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            node t = start;
            while (t != null)
            {
                if (t.data == key)
                {
                    return t;
                }

                t = t.next;
            }
            return null;
        }
    }
    
    public T deleteAtStart()
    {
        if(isEmpty())
            return null;
        
        else
        {
            node temp=start;
            start=start.next;
            return temp.data;
        }
        
    }
    
    public T deleteAtEnd()
    {
        if(isEmpty())
            return null;
        
        else
        {
        node t=start;
        node t2=null;
            while(t.next!=null)
            {
             t2=t;
             t=t.next;
            }
            t2.next=null;
            return t.data;
        }
    }
}
