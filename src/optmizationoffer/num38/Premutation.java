package optmizationoffer.num38;

public class Premutation {

  public static void main(String[] args) {
    char arr[] = {'a', 'b', 'c'};
    permutation(arr, 0, 3);
  }

  public static void swap(char[] arr, int idx1, int idx2) {
    char temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
  }

  public static void permutation(char[] arr, int index, int size) {
    if (index == size) {
      for (char anArr : arr) {
        System.out.print(anArr + "");
      }
      System.out.println();
    } else {
      for (int i = index; i < size; i++) {
        swap(arr, i, index);    //我们从index向后扫描每一个字符（即指针i指向的字符），交换index和i指向的字符
        permutation(arr, index + 1, size);  //对index后面的字符数组递归地做排列操作
        swap(arr, i, index);  //每次递归固定要排列字符数组第一个字符不变
      }
    }
  }

}
