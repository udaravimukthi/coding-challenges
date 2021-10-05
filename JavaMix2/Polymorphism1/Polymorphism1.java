//runtime polymorphism 
//method overriding
//late binding
//dynamic polymorphismS

public class Polymorphism1 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();

        System.out.println("Parent");
        p1.foo();
        System.out.println("Child");
        c1.foo();
    }
}

class Parent {
    public void foo() {
        System.out.println("fROM PARENT CLASS");
    }
}

class Child extends Parent {
    @Override
    public void foo() {
        System.out.println("fROM child class");
    }
}