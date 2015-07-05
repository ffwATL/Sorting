package sortedOne.linkedList;


public class SingleList<E> {

    private Node head;
    private Node tail;
    private int size;



    public void add(E e){
        Node<E> tmp = new Node(e,null);
        if(size > 0) {
            head.next = tmp;
            head = tmp;
        }
        else {
            tail = tmp;
            head = tail;
        }
        size++;
    }

    public sortedOne.linkedList.Node<E> getTail(){
        return this.tail;
    }

    private class Node<E> implements sortedOne.linkedList.Node{
        private E element;
        private Node next;

        public Node(E element, Node next){
            this.element = element;
            this.next = next;
        }

        public E getElement(){
            return this.element;
        }

        public Node<E> next(){
            return this.next;
        }

        public boolean hasNext(){
            return this.next != null;
        }
        @Override
        public String toString(){
            return this.element.toString();
        }

    }
    @Override
    public String toString(){
        String res="[";
        int c=0;
        Node<E> tmp = tail;
        while (tmp != null){
            res+=tmp.toString();
            if(c++ < size-1) res+=", ";
            tmp = tmp.next;
        }
        return res+="]";
    }
}
