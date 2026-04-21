class LinkedListQueue<T> extends AQueue<T> {

    
    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public Node<T> getHead(){
        return head;
    }
    // get tail
    public Node<T> getTail(){
        return tail;
    }


    public void setHead(Node<T> head){
        this.head = head;
    }
    public void setTail(Node<T> tail){
        this.tail = tail;
    }


    
    @Override
    public void push(Object element) {
        Node<T>node = new Node<T>(element);

        if (getTail() != null) {
            node.setPrev(getTail());
            getTail().setNext(node);
        }

        if (getHead() == null){
        setHead(node);
        }
        setTail(node);
        

    }

    
    @Override
    public T pop() {
        if (getHead() == null | getHead().getNext() == null) {
            return null;
        }

        T temp = getHead().getElement();
        setHead(getHead().getNext());
        return temp;

        
    }

    
    @Override
    public void display() {
        Node<T> check = this.head;
        while (check.getNext() != null) {
            System.out.println(check);
            check = check.getNext();
        }
    }

}