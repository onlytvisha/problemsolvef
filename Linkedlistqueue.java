class LinkedListQueue<T> extends AQueue<T> {

    
    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    
    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);

        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
        }

        this.tail = newNode;
    }

    
    @Override
    public T pop() {
        if (this.head == null) {
            return null;
        }

        T element = this.head.getElement();

        this.head = this.head.getNext();

        if (this.head != null) {
            this.head.setPrev(null);
        } else {
            this.tail = null;
        }

        return element;
    }

    
    @Override
    public void display() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

}