package optmizationoffer;

import java.security.InvalidParameterException;

public class ReBuildBinaryTree {
  public static Num7BinaryTreeNode Construct(int[] preOderArr, int[] inOrderArr, int length) {
    if (preOderArr == null || inOrderArr == null || length <= 0) {
      return null;
    }


    return ConstructorCore(
            preOderArr, 0, preOderArr.length - 1,
            inOrderArr, 0, inOrderArr.length - 1);

  }

  public static Num7BinaryTreeNode ConstructorCore(
          int[] preOrderArr, int startPreIndex, int endPreIndex,
          int[] inOrderArr, int startInIndex, int endInIndex
  ) {
//    System.out.println("input startPreIndex : " + startPreIndex);
//    System.out.println("preOrderArr.length : " + preOrderArr.length);

    int rootValue = preOrderArr[startPreIndex];
    Num7BinaryTreeNode root = new Num7BinaryTreeNode(rootValue);
    root.value = rootValue;

    if (startPreIndex == endPreIndex) {
      if (startInIndex == endInIndex &&
              preOrderArr[startPreIndex] == inOrderArr[startInIndex]) {
        return root;
      } else {
        throw new InvalidParameterException();
      }
    }

    int rootInIndex = startInIndex;
    while (rootInIndex <= endInIndex && inOrderArr[rootInIndex] != rootValue) {
      ++rootInIndex;
    }

    if (rootInIndex == endInIndex && inOrderArr[rootInIndex] != rootValue) {
      throw new InvalidParameterException();
    }
    int leftLength = rootInIndex - startInIndex;

    int leftPreOrderEndIndex = startPreIndex + leftLength;
//    System.out.println("startPreIndex : " + startPreIndex);
    if (leftLength > 0) {
      root.leftNode = ConstructorCore(
              preOrderArr, startPreIndex + 1, leftPreOrderEndIndex,
              inOrderArr, startInIndex, (rootInIndex - 1));
    }
    if (leftLength < endPreIndex - startPreIndex) {
      root.rightNode = ConstructorCore(
              preOrderArr, leftPreOrderEndIndex + 1, endPreIndex,
              inOrderArr, rootInIndex + 1, endInIndex);
    }
    return root;
  }

  public static void printPreOrder(Num7BinaryTreeNode root) {
    if (root == null) {
      return;
    } else {
      System.out.print(root.value + " ");
    }

    if (root.leftNode != null) {
      printPreOrder(root.leftNode);
    }

    if (root.rightNode != null) {
      printPreOrder(root.rightNode);
    }
  }

  public static void main(String args[]) {
    int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
    int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
    System.out.print(" start ");
    Num7BinaryTreeNode node = Construct(preOrder, inOrder, preOrder.length);
    printPreOrder(node);
  }
}
