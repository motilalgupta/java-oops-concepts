package Constructor;

public class Students {
    String name;
    int age;

    Students(){
        this("Unknown",0);
    }
    Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Students s = new Students("Motilal",23);
        s.showStudentDetails();

        Students s1 = new Students();
        s1.showStudentDetails();
//        s1.hello(s);
    }
    void showStudentDetails(){
        System.out.println("Name: "+name + " Age : "+age);
        hello(this);            // this will represent here as default constructor
    }
    void hello(Students s){
        System.out.println("Hello "+s.name);


    }
}
