package Enum;

enum Status1 {
    Running,Failed ,Pending,Success;

}
public class EnumIfAndSwich{
    public static void main ( String[] args ) {
        Status S = Status.Pending;
        if (S == Status.Pending)
            System.out.println ("Pending Status");
        else if (S == Status.Failed )
            System.out.println ("Failed Status");
        else if (S == Status.Success )
            System.out.println ("Success Status");
        else
            System.out.println ("Running Status");



        switch (S){
            case Pending -> System.out.println ("Pending Status");
            case Failed -> System.out.println ("Failed Status");
            case Success -> System.out.println ("Success Status");
            case Running -> System.out.println ("Running Status");
            default -> System.out.println ("try later");
        }
    }
}