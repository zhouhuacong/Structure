package optmizationoffer;

public class practices03 {

  public static void main(String args[]) {
    Node head = new Node(0);
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    head.setNext(node1);
    node1.setNext(node2);
    node2.setNext(node3);

    Node h = head;
    while (null != h) {
      System.out.println(h.getData() + "");
      h = h.getNext();
    }

    head = recursiveList(head);
    System.out.println("\n ----------------------- \n");
    while (null != head) {
      System.out.println(head.getData() + "");
      head = head.getNext();
    }
  }

  public static Node reseredList(Node head) {
    if (head == null) {
      return head;
    }
    Node preNode = null;
    Node curNode = head;
    Node reservedHead = null;
    while (curNode != null) {
      Node nextNode = curNode.getNext();
      if (nextNode == null) {
        reservedHead = curNode;
      }
      curNode.setNext(preNode);
      preNode = curNode;
      curNode = nextNode;
    }
    return reservedHead;
  }

  public static Node recursiveList(Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node nextNode = head.getNext();
    Node end = recursiveList(nextNode);
    nextNode.setNext(head);
    head.setNext(null);
    return end;
  }
}
