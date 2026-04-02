package SuperKeyword;

public class MethodParent {
    void show(){
        System.out.println("I am Parent Class");
    }
}
class MethodChild extends MethodParent{
    void show(){
        super.show();
        System.out.println("I am child class");
    }
}

class MethodTest{
    public static void main(String[] args) {
        MethodChild mchild = new MethodChild();
        mchild.show();
    }
}
