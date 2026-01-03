// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

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

    public void display() {
        Node node = head;
        Node tail = head;

        while (node != null) {
            System.out.print(node.val + " -> ");
            tail = node;
            node = node.next;
        }

        System.out.println("END");

        System.out.println("LL is reversed");

        while (tail != null) {
            System.out.print(tail.val + " -> ");
            tail = tail.prev;
        }

        System.out.println("START");
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
