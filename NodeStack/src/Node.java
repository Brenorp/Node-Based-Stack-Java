public class Node {
    private final int info;
    private Node next;

    public Node(int info, Node next){
        this.info = info;
        this.next = next;
    }

    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
