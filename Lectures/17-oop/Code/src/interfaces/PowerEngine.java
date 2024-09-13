package OPP5.interfaces;

public class PowerEngine implements Engine{

    @Override
    public void Start () {
        System.out.println ("PowerEngine Start" );

    }

    @Override
    public void Stop () {
        System.out.println ("PowerEngine Stop" );
    }

    @Override
    public void acc () {
        System.out.println ("PowerEngine acc" );
    }
}
