package optmizationoffer.num25;

import optmizationoffer.Node;

public class CombinLinkedList {

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


  }

  public static Node combin(Node head1, Node head2) {
    Node curListNode1 = head1;
    Node curListNode2 = head2;
    Node combinedHead = null;

    combinedHead =
        head1.getData() > head2.getData() ? head1 : head2;


    while (true) {
      if (curListNode1.getData() > curListNode2.getData()) {
        combinedHead.setNext(curListNode1);
        curListNode1 = curListNode1.getNext();
      } else {
        combinedHead.setNext(curListNode2);
        curListNode2 = curListNode2.getNext();
      }
      combinedHead = combinedHead.getNext();
      if (curListNode1 == null || curListNode2 == null) {
        break;
      }
    }

    if (curListNode1 == null) {
      Node next = curListNode2.getNext();
      combinedHead.setNext(next);
      curListNode2 = next;
      combinedHead = next;

    }


    return null;
  }

  public static Node recursiveMerge(Node head1, Node head2) {
    if (head1 == null) return head2;
    else if (head2 == null) return head1;

    Node mergedHead = null;

    if (head1.getData() > head2.getData()) {
      mergedHead = head1;
      head1 = head1.getNext();
      mergedHead.setNext(recursiveMerge(head1, head2));
    } else {
      mergedHead = head2;
      head2 = head2.getNext();
      mergedHead.setNext(recursiveMerge(head1, head2));
    }

    return mergedHead;
  }
}
