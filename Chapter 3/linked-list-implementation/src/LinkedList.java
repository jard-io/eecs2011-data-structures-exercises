

public class LinkedList<E> {
    private class Node<E>
    {
        private E val;
        private Node<E> next;

        private Node(E val)
        {
            this.val = val;
        }
    }

    Node<E> head;
    Node<E> tail;
    int size;

    public LinkedList(E val){
        head = new Node()
    }
}
