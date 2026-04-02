package HierarchialInheritance;

public class TestHierarchial {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teach();

        Student1 std1 = new Student1();
        std1.listen();
        std1.teach();

        Student2 std2 = new Student2();
        std2.teach();
    }
}
