package OPP6.Generics2;
// Generic Methods :
public class Generic3{
    public static void main ( String[] args ) {
        shout ("ilyass" );
        sout2 ("ilyass",21);
    }

    private static <T> void shout (T thingToshout){
        System.out.println (thingToshout + "!!!");
    }
    private static <T,V> void sout2 (T thingToshout , V otherthing){
        System.out.println (thingToshout +":" + otherthing);
    }

}
