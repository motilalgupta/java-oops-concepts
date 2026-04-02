package SuperKeyword;

public class VariableParent {
    int x = 100;
    void show(){
        System.out.println("The number is: "+x);
    }
}
class VariableChild extends VariableParent{
    int x = 10;
    void show(){
        super.show();
        System.out.println("the number is: "+x);
    }
}
class VariableTest{
    static void main() {
        VariableChild varChild = new VariableChild();
        varChild.show();
    }
}
