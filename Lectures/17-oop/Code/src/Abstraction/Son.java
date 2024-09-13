package OPP5.Abstraction;

public class Son extends Parent{
    @Override
    void Career () {
        System.out.println ("im going to be a Developer");
    }

    @Override
    void Partner (){
        System.out.println ("i love Dana");
    }

    public Son ( int age ) {
        super ( age );
    }
}
