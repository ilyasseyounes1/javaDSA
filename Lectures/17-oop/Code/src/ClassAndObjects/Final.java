package OPP1;
public class Final {
    public static void main(String[] args) {
        //  WrapperExampl

        int a = 10;
        int b = 20;
        Integer A = 33;
        Integer B = 99;
        System.out.println(a + "" + b);
        System.out.println(A + "" + B);
        //********************************************** */
       final A ilyass = new A ("ilyasse younse") ;
       ilyass.name = "other name" ;
        // when a non primitive is final , you cannot reassign it 
        // ilyass = new a ("new obj");
        //************************************************** */
        A obj = new A ("younes") ;
        System.out.println(obj);
        for (int i = 0 ; i < 1000000000;i++) {
            obj = new A ("random#1") ;
        }

    }

    static void swap(int a, int b) { // it not swaping because its a pass by value ...
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer A, Integer B) { // it not swaping --> its a final ..
        int temp = A;
        A = B;
        B = temp;

    }

     

}
class A {
        final int num = 10;
        String name;

        public A(String name) {
            System.out.println("obj created ");
            this.name = name;
        }
        @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
    }