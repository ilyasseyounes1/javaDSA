package OPP6.Generics2;

public class Printer<T extends Animal & Serializable>{ // "extend Animal "this is called bounded generic its limite on the type that able to be past in.
    // use extends not implement, u can extend one class.
    T thingToprint;

    public Printer ( T thingToprint ) {
        this.thingToprint = thingToprint;
    }

    public void print () {
        thingToprint.eat ();
        System.out.println ( thingToprint );
    }
}
