package OPP5.interfaces.extendDemo2;

public class Main implements A,B{
    @Override
    public void greet () {
        System.out.println ("Hello World");
    }

    public static void main ( String[] args ) {
        Main m = new Main();
        m.fun ();
        m.greet ();
    }


    }
