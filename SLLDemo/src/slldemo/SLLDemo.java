package slldemo;

public class SLLDemo
{

    public static void main(String[] args)
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtStart(22);
        sll.insertAtEnd(45);
        sll.insertAtEnd(35);
        sll.insertAtStart(99);
        sll.insertAtEnd(100);
        sll.traverse();
        System.out.println(sll.search(100));
    }

}
