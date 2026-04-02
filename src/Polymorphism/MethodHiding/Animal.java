package MethodHiding;

class Animal{
    static void show(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    static void show(){
        System.out.println("Dog is barking");
    }
}

class Test{
    public static void main(String[] args){
//        Animal anml = new Dog();              // parent call kyuki static me reference ko dekhte hai
//        anml.show();
        Dog dog = new Dog();                    // child call
        dog.show();
    }
}

