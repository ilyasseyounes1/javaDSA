package OPP5.interfaces;

public class MyCar {
    private Engine engine;
    private Media player = new CDPlayer ();

    public MyCar() {
        engine = new PowerEngine ();
    }
    public MyCar (Engine engine) {
        this.engine = engine;
    }
    public void Start (){
        engine.Start();
    }
    public void stop(){
        engine.Stop();
    }
    public void accelerate(){
        engine.acc ();
    }
    public void starMusic (){
        player.Start ();
    }
    public void pauseMusic (){
        player.Stop ();
    }
    public void upgradeEngine (){
        this.engine = new ElectricEngine ();
    }
}
