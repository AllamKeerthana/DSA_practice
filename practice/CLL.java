public class CLL{
    public static void main(String[] args) {
        cll list = new cll();
        list.InsertFirst(10);
        list.InsertFirst(20);   
        list.InsertLast(5);
        list.InsertIndex(15,2);
        list.delFirst();
        list.delLast(); 
        list.delInd(0); 

    }

}
class cll{
    private Node head;
    private Node tail;
    private int size;
private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void delFirst(){
        if(head == null){
            return;
        }
        if(size == 1){
            head = null;
            tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
        }
        size--;
    }

    public void delLast(){
        if(tail == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
        size--;
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;  // Ensure circular
        } else {
            node.next = head;
            tail.next = node;
            head = node;
        }
        size++;
    }

    public void InsertLast(int val){
        Node node = new Node(val);
        
        if(tail == null){
            InsertFirst(val);
            return;
        }
        
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }
    public void InsertIndex(int val, int ind){
        if(ind < 0 || ind > size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(ind == 0){
            InsertFirst(val);
            return;
        }
        if(ind == size){
            InsertLast(val);
            return;
        }
        
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1; i < ind; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void delInd(int ind){
        if(ind < 0 || ind >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(ind == 0){
            delFirst();
            return;
        }
        if(ind == size - 1){
            delLast();
            return;
        }
        
        Node temp = head;
        for(int i = 1; i < ind; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("(back to head: " + head.val + ")");
    }


}