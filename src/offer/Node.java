package offer;

public class Node {
  private int Data;
  private Node Next;

  public Node(int data) {
    this.Data = data;
  }

  public int getData() {
    return this.Data;
  }

  public void setData(int data) {
    this.Data = data;
  }

  public Node getNext() {
    return Next;
  }

  public void setNext(Node next) {
    this.Next = next;
  }
}