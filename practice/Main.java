// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        list.display();
        list.insertLast(40);
        list.display();
        list.insertIndex(50,3);
        list.display();
    }
}

class DLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null)
        {
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next!=null){ 
            temp= temp.next;
        }
        temp.next = node;
        node.next=null;
        node.prev=temp;
        return;
        
    }

    public void insertIndex(int val, int ind) {
    Node node = new Node(val);

    // insert at head
    if (ind == 0) {
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        return;
    }

    Node temp = head;
    int count = 0;

    // move to (ind - 1)
    while (temp != null && count < ind - 1) {
        temp = temp.next;
        count++;
    }

    // index out of bounds
    if (temp == null) return;

    node.next = temp.next;
    node.prev = temp;

    if (temp.next != null) {
        temp.next.prev = node;
    }

    temp.next = node;
}


    public void deleteFirst() {
        if (head == null) return;

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }
    public void deleteLast() {
        if (head == null) return;

        // only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

        public void deleteAtIndex(int index) {
        if (head == null || index < 0) return;

        // delete head
        if (index == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        // index out of bounds
        if (temp == null) return;

        // fix previous link
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        // fix next link
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }
    public void display() {
        Node node = head;
        Node tail = head;
        System.out.println("printing the DLL");
        while (node != null) {
            System.out.print(node.val + " -> ");
            tail = node;
            node = node.next;
        }

        System.out.println("END");

        // System.out.println("LL is reversed");

        // while (tail != null) {
        //     System.out.print(tail.val + " -> ");
        //     tail = tail.prev;
        // }

        // System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
