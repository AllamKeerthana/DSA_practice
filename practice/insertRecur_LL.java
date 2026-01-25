public class insertRecur_LL {
    public static void main(String[] args) {
        LL list = new LL();

        // inserting elements
        list.insertRec(10, 0); // 10
        list.insertRec(20, 1); // 10 -> 20
        list.insertRec(30, 2); // 10 -> 20 -> 30
        list.insertRec(15, 1); // 10 -> 15 -> 20 -> 30

        // display list
        list.display();
    }
}
class LL{
    Node head;
    int size;
    
    public void insertRec(int val, int ind){
        head = insertRec(val, ind, head);
    }
    private Node insertRec(int val, int ind, Node node){
        if(ind==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        
        
        node.next = insertRec( val, ind-1, node.next);
        return node;
        
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    
    class Node{
        int val;
        Node next;
        
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

}
    
    

