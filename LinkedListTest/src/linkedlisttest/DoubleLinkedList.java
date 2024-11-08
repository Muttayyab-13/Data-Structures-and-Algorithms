package linkedlisttest;

public class DoubleLinkedList<T>
{

    class node
    {

        node next;
        node pre;
        T data;

        public node(T value)
        {
            this.data = value;
        }
    }

    node start;
    node end;

    public boolean isEmpty()
    {
        return (start == null);

    }

    public void insertAtStart(T value)
    {
        node n1 = new node(value);
        n1.pre = null;
        if (isEmpty())
        {

            n1.next = null;
            start = end = n1;
        } else
        {

            n1.next = start;
            start.pre = n1;
            start = n1;
        }
    }

    public void insertAtEnd(T value)
    {
        node n1 = new node(value);
        n1.next = null;
        if (isEmpty())
        {
            n1.pre = null;
            start = end = n1;
        } else
        {
            n1.pre = end;
            end.next = n1;
            end = n1;
        }
    }

    public T deleteAtStart()
    {
        if (isEmpty())
        {
            System.out.println("List is Empty");
            return null;
        } else if (start.next == null)
        {
            T value = start.data;
            start = end = null;
            return value;
        } else
        {
            T value = start.data;
            start.next.pre = null;
            start = start.next;
            return value;
        }
    }

    public T deleteAtEnd()
    {

        if (isEmpty())
        {
            System.out.println("The list is Empty");
            return null;
        } else if (start.next == null)
        {
            T value = start.data;
            start = end = null;

            return value;
        } else
        {
            end.pre.next = null;
            end = end.pre;
            T value = end.data;
            return value;
        }
    }

}
