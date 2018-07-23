public class Main {

  public static void main(String[] args) {
    print("hello world ");
    stackTry();
  }

  private static void print(String s) {
    System.out.println(s);

  }

  public static void stackTry() {
    stackTry();
  }
}
