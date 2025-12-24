public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        if(head==null){
            return;
        }
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;

    }

    public void deleteLast(){
            if(head==null){
                return;
            }
            Node temp = head;
            while(temp.ext!=tail){
                temp=temp.next;
            }
            
            temp.next = null;
            tail = temp;
            size--;
    }

    public void deleteIndex(int index){
        if(head==null || index<0 || index>=size){
            return;
        }

        if(index==0){
            deleteFirst();
            return;  
        }

        if(index==size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
