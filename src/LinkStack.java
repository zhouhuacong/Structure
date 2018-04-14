public class LinkStack<T> {
    private class Node {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node topNode;

    public LinkStack() {
        topNode = null;
        size = 0;
    }

    public LinkStack(T element) {
        topNode = new Node(element);
        size++;
    }

    public void push(T element) {
        topNode = new Node(element, topNode);
        size++;
    }

    public T pop() {
        Node oldTop = topNode;
        topNode = topNode.next;
        size--;
        return oldTop.data;
    }

    public T peek() {
        return topNode.data;
    }

    public void clear() {
        size = 0;
        topNode = null;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            StringBuffer sb = new StringBuffer("[");

            for (Node current = topNode; current != null; current = current.next) {
                sb.append(current.data.toString() + ",");
            }
            return sb.toString().substring(0, sb.length() - 1) + "]";
        }
    }
}
