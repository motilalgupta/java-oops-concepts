package Constructor;

public class Course {
    String name;
    int duration;

//    Course(){
//
////        System.out.println("Constructor called ");
//    }
    Course(String name, int duration){
//        System.out.println(name);
        this.name = name;                                       // instance = local
        this.duration = duration;
//        System.out.println("Para constructor called");
    }
    public static void main(String[] args) {
//        System.out.println("Before object creation");
        Course c = new Course("Java",5);
//        System.out.println("After object creation");
//        c.name="JAVA";
//        c.learn(c);

        Course c1 = new Course("DevOps",4);
//        c1.name="DevOps";
//        c1.learn(c1);

        // para
        Course c2 = new Course("DSA",3);

        System.out.println(c.name);
        System.out.println(c.duration);
        System.out.println(c1.name);
        System.out.println(c1.duration);
        System.out.println(c2.name);
        System.out.println(c2.duration);

    }
    void learn(Course c){
        System.out.println("We are learning "+c.name);
    }

}
