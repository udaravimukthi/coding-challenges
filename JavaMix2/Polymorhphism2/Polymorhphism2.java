//compiler time polymorphism
//method overloading 
//statatic binding
//early binding

public class Polymorhphism2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.foo(5);
        p.foo(5, 10);

    }
}

class Parent {
    public void foo(int a) {
        System.out.println("Parsing number:" + a);
        ;
    }

    public void foo(int a, int b) {
        int c = a + b;
        System.out.println("Output" + c);
    }
}
