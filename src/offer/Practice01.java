package offer;

public class Practice01 {

  public void main(String args[]) {

  }

  public static Node reverseLinkedList(Node head) {

    if (head == null || head.getNext() == null) {
      return head;
    }
    Node reverseHead = null;
    Node node = head;
    Node prevNode = null;

    while (node != null) {
      Node next = node.getNext();
      if (next == null) {
        reverseHead = node;
      }
      node.setNext(prevNode);
      prevNode = node;
      node = next;
    }


    return reverseHead;
  }


}
