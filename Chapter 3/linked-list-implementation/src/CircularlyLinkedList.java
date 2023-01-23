

public class CircularlyLinkedList<E> extends LinkedList<E> {

    private Node<E> tail;
    private int size;

    public CircularlyLinkedList()
    {
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
        return tail.getNext().getElement();
    }

    public E last() {
        return tail.getElement();
    }

    public void addFirst(E e) {

        Node<E> newest = new Node<E>(e, tail.getNext());
        if(size == 0){
            tail = newest;
        }
        tail.setNext(newest);
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
