package HierarchialInheritance;

public class Teacher {
    void teach(){
        System.out.println("Teaching Java");
    }
}
class Student1 extends Teacher{
    void listen(){
        System.out.println("I like to listening music");
    }

    @Override
    void teach() {
        System.out.println("Not interested in learning");
    }
}
class Student2 extends Teacher{
    @Override
    void teach() {
        System.out.println("Interested in learning Java");
    }
}
