public class Student {
    String name;
    int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student name = " + name + " ,num = " + num;
    }
}
