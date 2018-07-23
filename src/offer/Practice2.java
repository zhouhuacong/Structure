package offer;

public class Practice2 {

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

    if (head == null) {
      System.out.println("head 是空");
    }
    while (null != head) {
      System.out.println(head.getData() + "");
      head = head.getNext();
    }
  }

  public static Node reverseList(Node head) {
    if (head == null) {
      return head;
    }
    Node reveredNode = null;
    Node preNode = null;
    Node curNode = head;

    while (curNode != null) {
      Node nextNode = curNode.getNext();
      if (nextNode == null) {
        reveredNode = curNode;
      }
      curNode.setNext(preNode);
      preNode = curNode;
      curNode = nextNode;
    }

    return reveredNode;
  }

  public static Node recursiveList(Node node) {
    if (node == null || node.getNext() == null) {
      return node;
    }
    Node next = node.getNext();
    Node endNode = recursiveList(next);
    next.setNext(node);
    node.setNext(null);
    return endNode;
  }
}
