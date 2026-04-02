package Constructor;

public class Student {
    String name;
    int age;
    String add;
    String ph_no;

    Student(String name, int age, String add, String ph_no){
        this.name = name; // local = instance
        this.age = age;
        this.add = add;
        this.ph_no = ph_no;
    }

    public static void main(String[] args) {

        Student s = new Student("Motilal", 22, "Hazaribagh", "6201267194");

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.add);
        System.out.println(s.ph_no);
    }


}
