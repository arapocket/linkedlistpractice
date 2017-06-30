
public class LinkedList {

    LinkNode head;
    int length = 0;

    public LinkedList() {
    }

    public void add(String name) {
        LinkNode node = new LinkNode(name);
        if (this.head == null) {
            this.head = node;
        } else if (this.head.next == null) {
            this.head.next = node;
            this.head.pre = node;

            node.pre = this.head;
            node.next = this.head;

        } else {

            node.next = this.head;
            node.pre = this.head.pre;
            this.head.pre = node;
            node.pre.next = node;
        }
    }

    public void remove(String removeThisName) {
        if (this.head == null) {
            System.out.println("this list is empty");
        }

        else
            for (i = 0; i < this.length; i++) {
                if (this.head.name == removeThisName) {
                    this.head.next = this.head.pre.next;
                    this.head.next.pre = this.head.pre;
                }
            }

    }

    public void printList() {
        linkNode currentHead = this.head;

        for (int i = 0; i != this.length; i++) {
            System.out.Println(currentHead.name);
            System.out.Println("our next head name is currently" + this.head.next.name);
            currentHead = this.head.next;
        }
    }

}