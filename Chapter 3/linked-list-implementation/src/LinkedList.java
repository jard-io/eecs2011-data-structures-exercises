

public abstract class LinkedList<E> {
    protected class Node<E>{
        private E val;
        private Node<E> next;

        public Node(E val, Node<E> next){
            this.val = val;
            this.next = next;
        }

        public E getElement(){
            return val;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> nextNode){
            this.next = nextNode;
        }
    }

    public abstract int size();

    public abstract boolean isEmpty();
    public abstract E first();

    public abstract E last();

    public abstract void addFirst(E e);

    public abstract void addLast(E e);

    public abstract E removeFirst();
}
