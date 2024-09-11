package OPP5.Abstraction;

public class Daughter extends Parent{
    @Override
    void Career (){
        System.out.println ("im going to be a doctor");
    }
    @Override
    void Partner (){
        System.out.println ("I love Sam");
    }

    public Daughter ( int age ) {
        super ( age );
    }
}
