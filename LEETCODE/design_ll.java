class design_ll {
    private Node head;
    private int size = 0;
    public design_ll() {
        head = null;
        size=0;
    }
        private class Node {
            int val;
            Node next;

            Node(int val){
                this.val = val;
                this.next = null;
            }
        }
    
    public int get(int index) {
        if(index<0||index>size-1){
            return -1;
        }
        if(index == 0) return head.val;
        Node temp = head;

        for(int i =1;i<=index;i++){
            temp = temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next=head;

        head = node;
        size++;

    }
    
    public void addAtTail(int val) {
        
        Node node = new Node(val);
        Node temp = head;
        if(head==null){
            head = node;
            size++; 
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        size++;

    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        
        Node temp = head;
        Node node = new Node(val);
        for(int i = 1; i<index;i++){
            temp=temp.next;

        }
        
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        
        if(index<0||index>size-1) return;
        if(index==0){
            head=head.next;
            size--;
            return; 
        }
        

        Node temp = head;
        for(int i =1 ;i<index;i++){
            temp =temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */