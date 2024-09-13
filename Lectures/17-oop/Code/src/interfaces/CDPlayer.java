package OPP5.interfaces;

public class CDPlayer implements Media {
    @Override
    public void Start () {
        System.out.println ("CDPlayer is starting...");
    }

    @Override
    public void Stop () {
        System.out.println ("CDPlayer is stopping...");
    }
}
