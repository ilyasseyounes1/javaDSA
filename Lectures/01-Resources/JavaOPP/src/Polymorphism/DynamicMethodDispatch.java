package Polymorphism;

public class DynamicMethodDispatch{
    static class  A {
        public void show (){
            System.out.println ("im in A");
        }
    }
    static class B extends A{
        public void show (){
            System.out.println ("im in B");
        }
    }
    static class C extends B{
        public void show (){
            System.out.println ("im in C");
        }
    }
    public static void main(String[] args) {
        A obj = new A ();
        obj.show ();
        obj = new B ();
        obj.show ();
        obj = new C ();
        obj.show ();
    }
}
