public class LinkedList3 {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isLoopDetected(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr)
                return true;
        }

        return false;
    }

    public Node findStartNodeOfTheLoop() {
        Node fastPtr = head;
        Node slowPtr = head;
        boolean loopExists = false;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                loopExists = true;
                break;
            }

        }
        if (loopExists) {
            slowPtr = head;

            while (slowPtr != fastPtr) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }


        } else {
            System.out.println("Loop does not exists");
            slowPtr = null;
        }
        return slowPtr;
    }


    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
// Creating a linked list
        Node loopNode = new Node(7);
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(loopNode);
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList();
        list.addToTheLast(loopNode);
        Boolean isLoopDetected = list.isLoopDetected(list.head);
//        Node startNode=list.findStartNodeOfTheLoop();
//        if(startNode!=null)
//            System.out.println("start Node of loop is "+ startNode.value);
    }
}