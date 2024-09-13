package OPP5.interfaces;

public class Car implements Engine,Breake{
    @Override
    public void Breake () {
        System.out.println ("Car breaking");
    }

    @Override
    public void Start () {
        System.out.println ("Car starting");
    }

    @Override
    public void Stop () {
        System.out.println ("Car stopping");
    }

    @Override
    public void acc () {
        System.out.println ("Car accelerating");
    }
}
