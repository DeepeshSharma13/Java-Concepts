public class LinkedList <T>{
    Node head;
    
    
    class Node{
        T data;
        Node next;
        
        Node(T d){
            data = d;
        }
    }
    
    public void printList(){
        
          Node last = this.head;
          while(last != null){
                System.out.println(last.data);
                last = last.next;
                
            }
        
    }
    
    public void remove(T key){
            Node prev = null;
            Node current = this.head;
            
            if(current.data == key){
                this.head = this.head.next;
                return;
            }
            
            while(current != null){
                
                if(current.data == key){
                    prev.next = current.next;
                    
                }
                prev = current;
                current = current.next;
            }
           
    }
    
    
    public boolean add(T data){
        Node new_node = new Node(data);
        new_node.next = null;
        
        if(this.head == null){
            this.head = new_node;
        }
        else{
            Node last = this.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return true;
    }
    
    
    public static void main(String args[]){
     
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add("A");
        
        list.remove(5);
        
        list.printList();
        
    }
    
}