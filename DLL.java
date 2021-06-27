public class DLL <T>{
    Node head;

    private class Node{
        T data;
        Node prev;
        Node next;

        Node(T el){
            data = el;
        }
    }

    /* All Elements to List */
    public void add(T data){
      Node new_node = new Node(data);
      Node last = this.head;

      if(this.head == null){
        new_node.prev = null;
        this.head = new_node;
        return;
      }

      while( last.next != null ){
        last = last.next;
      }
      new_node.prev = last;
      last.next = new_node;

    }

    /* Print the List */
    public void print(){
      Node last = this.head;
      while( last != null ){
        System.out.println(last.data);
        last = last.next;
      }
    }

    /* Add Element at Start */
    public void push(T data){
      Node new_node = new Node(data);
      Node top_node = this.head;
      new_node.prev = null;

      if(this.head == null){
        new_node.next = null;
        this.head = new_node;
      }
      else{
        new_node.next = top_node;
        top_node.prev = new_node;
        this.head = new_node;
      }



    }

    public static void main(String args[]){
      DLL list = new DLL();

      list.add(4);
      list.add(2);
      list.add(7);
      list.add(9);
      list.add("A");

      list.push(10);
      list.push("V");

      list.print();

    }


}
