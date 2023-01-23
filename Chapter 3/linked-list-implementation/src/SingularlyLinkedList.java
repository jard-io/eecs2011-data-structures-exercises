


public class SingularlyLinkedList<E> extends LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * Constructor for a singularly linked list. Initializes head and tail to null, and size to 0.
     */
    public SingularlyLinkedList()
    {
        head = null;
        tail = null;
        size = 0;

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E first(){
        return head.getElement();
    }

    public E last() {
        return tail.getElement();

    }

    public void addFirst(E e) {
        head = new Node<E>(e, head);
        if (size == 0){
            tail = head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newestNode = new Node<E>(e, null);
        if (isEmpty()) {
            head = newestNode;
        }
        else {
            tail.setNext(newestNode);
            tail = newestNode;
        }
        size++;
    }

    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        E headVal = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return headVal;
    }
}
