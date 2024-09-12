package OPP6.ExcaptionHandling;

public class Main{
    public static void main ( String[] args ) {
        int a = 4;
        int b = 0;
        try {
           // int c = a/b;
            String name = "ilyass";
            throw new MyException ("name is ilyass");
        }catch (MyException e){
            System.out.println (e.getMessage ());
        }catch (Exception e) {
            System.out.println ( "Normal exception" );
            // if u change the order its wont work,because Exception contain Arinth.exp
        }finally {
            System.out.println ("this will always execute");
        }



    }
    static int divide (int a, int b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException ("divide by zero");
        }
        return a / b;
    }
}
