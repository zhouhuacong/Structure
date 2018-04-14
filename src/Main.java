public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkStack<Student> stack = new LinkStack<>();
        stack.push(new Student("zhc", 89));
        stack.push(new Student("gre", 3));
        stack.push(new Student("jy", 34));
        stack.push(new Student("po", 45));

        print("peek : " + stack.peek());
        print("pop : " + stack.pop());
        stack.clear();
        print("clear : " + stack.toString());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
