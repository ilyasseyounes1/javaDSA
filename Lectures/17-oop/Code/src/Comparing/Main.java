package OPP6.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main ( String[] args ) {
        Student ilyass = new Student ( 21,99.3f );
        Student younes = new Student ( 33,89.33f );
        Student sam = new Student ( 21,99.3f );
        Student sam1 = new Student ( 21,99.3f );

        Student [] list = { sam, sam1,ilyass,younes };
        System.out.println ( Arrays.toString (list));
        Arrays.sort ( list , new Comparator<Student> (){
            @Override
            public int compare ( Student o1 , Student o2 ) {
                return -(int) (o1.marks - o2.marks);
            }
        });
        System.out.println (Arrays.toString (list));


        if (ilyass.compareTo ( younes )<0){
            System.out.println ("younes has more marks");
        }
    }
}
