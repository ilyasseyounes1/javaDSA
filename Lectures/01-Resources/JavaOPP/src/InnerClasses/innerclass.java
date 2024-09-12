package InnerClasses;

public class innerclass{
        class A {
            int age ;
            public  void show(){
                System.out.println ("im in show");
            }
            static class B {
                public void config (){
                    System.out.println ("im in config");
                }
            }
        }

        public static void main ( String[] args ) {
            innerclass obj0 = new innerclass();
            innerclass.A obj = obj0.new A();
            // innerclass.A obj = new innerclass.A();
            obj.show ();
            A.B obj2 = new A.B ();
            obj2.config ();
        }
    }


