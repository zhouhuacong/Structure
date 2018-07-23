package offer;

import java.util.LinkedList;

/**
 * 单链表翻转
 */
public class ReverseSingleLinkList {

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

    head = reversal(head);
    System.out.println("\n ----------------------- \n");
    while (null != head) {
      System.out.println(head.getData() + "");
      head = head.getNext();
    }
  }

  private static Node reversal(Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node reHead = reversal(head.getNext());
    head.getNext().setNext(head);
    head.setNext(null);
    return reHead;
  }

  private static Node reversal2(Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node pre = head;
    Node cur = head.getNext();
    Node tmp;
    while (cur != null) {
      tmp = cur.getNext();
      cur.setNext(pre);
      pre = cur;
      cur = tmp;
    }
    return null;
  }

}
