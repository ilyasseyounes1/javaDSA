package OPP5.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void Start () {
        System.out.println ("Starting Electric Engine");
    }

    @Override
    public void Stop () {
        System.out.println ("Stopping Electric Engine");
    }

    @Override
    public void acc () {
        System.out.println ("acc Electric Engine");
    }
}
