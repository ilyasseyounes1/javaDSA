package Enum;

enum Status {
    Running,Failed ,Pending,Success;
}
public class Enum1{
    public static void main ( String[] args ) {
        Status s1 = Status.Running;
        System.out.println (s1);

        Status s2 = Status.Success;
        System.out.println (s2.ordinal ());

        Status[] s3 = Status.values ();
        for (Status s4 : s3){
            System.out.println (s4 + ":" + s4.ordinal ());
        }
    }
}
