package OPP5.interfaces;

public class Main{
    public static void main ( String[] args ) {
       // Car car = new Car ();
        // Engine car = new Car ();
        //car.Start ();
       // car.Start ();
       // car.acc ();
        // not to use interfaces in performance critical code, because it happens at run time.

        MyCar car1 = new MyCar ();
        car1.Start ();
        car1.stop ();
        car1.accelerate ();
        car1.starMusic ();
        car1.pauseMusic ();

        car1.upgradeEngine ();
        car1.Start ();
        car1.stop ();
    }
}
