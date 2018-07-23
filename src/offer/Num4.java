package offer;

public class Num4 {

  private static boolean isInTheArray(int[][] arr, int num) {
    int xLength = arr[0].length;
    int yLength = arr.length;

    for (int y = 0; y < yLength - 1; y++) {
      for (int tailX = xLength - 1; tailX >= 0; tailX--) {
        if (arr[y][tailX] == num) {
          return true;
        } else if (arr[y][tailX] < num) {
          break;
        }
      }
    }
    return false;
  }

  private static boolean findInArr(int[][] arr, int num) {
    boolean isFound = false;

    if (arr != null) {
      int yLength = arr.length;
      int xLength = arr[0].length;
      if (xLength > 0) {
        int row = xLength - 1;
        int col = 0;

        while(row > 0 && col > 0) {
          if (arr[row][row * col + col] == num) {

          }
        }
      }
    }
    return isFound;
  }

  public static void main(String args[]) {
    int[][] arr = {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15},
            {7, 9, 13, 18}

    };
    int yLength = arr.length;
    int xLength = arr[0].length;
    System.out.println("The double arr xLength is = " + xLength);
    System.out.println("The double arr yLength is = " + yLength);
    boolean isIn = isInTheArray(arr, 2);
    System.out.println("is in the double arr = " + isIn);
  }
}


