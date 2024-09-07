package OPP3.Polymorphism;
 // first  type of polymorphism: static polymorphism / compile time
public class Number{
    double  sum (double a , int  b){
        return a + b;
    }
    int sum (int a , int b , int c){
        return a + b+ c;
    }

    public static void main ( String[] args ) {
        Number obj = new Number ();
        obj.sum ( 1,2 ); // here java convert int to double by auto casting
        obj.sum ( 1,2 ,3);

    }
}
