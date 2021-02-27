public class CircularLinkedList {
    
    static class Node{
        int data;
        Node next;
                
    }
    static Node addtoempty(Node last, int data){
        if (last != null)
            return last;
        
        Node temp =new Node();
        
        temp.data=data;
        last=temp;
        last.next=last;
        return last;
    }
    
    static Node addbegin(Node last, int data){
        if(last == null)
            return addtoempty(last,data);
        
        Node temp =new Node();
        
        temp.data =data;
        temp.next=last.next;
        last.next=temp;
        
        return last;
        
    }
    
    static Node addend(Node last, int data){
        if (last== null)
           return addtoempty(last, data);
        
        Node temp =new Node();
        temp.data=data;
        temp.next=last.next;
        last.next=temp;
        last=temp;
        return last;
    }
    
    static Node addafter(Node last, int data, int item){
        if (last== null)
            return null;
          
            Node temp, p;
            p=last.next;

            do{
                if (p.data ==item){
                    temp=new Node();
                    temp.data=data;
                    temp.next=p.next;
                    p.next=temp;
                    
                    if (p == last)
                        last=temp;
                    
                    return last;
                }
                p=p.next;
            }
            
            while(p !=last.next);
            
            System.out.println(item + "tidak ada present dalam list");
            
            
            return last;
    }
    static void traverse(Node last){
        Node p;
        if (last == null){
            System.out.println("List is Empty.");
            return;
        }
        p = last.next; 
        do{
            System.out.print(p.data + " ");
            p = p.next;
        }
        while (p != last.next);
    }
   
    public static void main(String[] args) {
        Node last = null;
        last = addtoempty(last, 6);
        last = addbegin(last, 4);
        last = addbegin(last, 3);
        last = addend(last, 10);
        last = addend(last, 9);
        last = addend(last, 50);
        last = addafter(last, 70, 9);

        traverse(last);
        System.out.println("");
    }
    
}