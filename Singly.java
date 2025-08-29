class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class Singly {
    Node head;

    void addFirst(int d) {
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    void addLast(int d) {
        Node n = new Node(d);
        if (head == null) { head = n; return; }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = n;
    }

    void delFirst() {
        if (head != null) head = head.next;
    }

    void delLast() {
        if (head == null || head.next == null) { head = null; return; }
        Node t = head;
        while (t.next.next != null) t = t.next;
        t.next = null;
    }

    int size() {
        int c = 0;
        for (Node t = head; t != null; t = t.next) c++;
        return c;
    }

    void reverse() {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void print() {
        for (Node t = head; t != null; t = t.next)
            System.out.print(t.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Singly ll = new Singly();
        ll.addFirst(3);
        ll.addLast(5);
        ll.addFirst(1); 
        ll.print();

        ll.delFirst(); 
        ll.print();
        ll.delLast(); 
        ll.print();
        System.out.println("Size: " + ll.size());
        ll.addLast(7); 
        ll.addLast(9); 
        ll.print();
        ll.reverse(); 
        ll.print();
    }
}