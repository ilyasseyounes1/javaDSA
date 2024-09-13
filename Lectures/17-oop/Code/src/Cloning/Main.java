package OPP6.Cloning;

import OPP5.interfaces.extendDemo.A;

import java.util.Arrays;

public class Main{
    public static void main ( String[] args ) throws CloneNotSupportedException {
        Human ilyass = new Human(18, "Ilyass");
        Human twin  = (Human)ilyass.clone();
        System.out.println ( STR."\{twin.name}: \{twin.age}" );
        System.out.println ( Arrays.toString (twin.arr ));
        twin.arr[0] = 100;
        // System.out.println (Arrays.toString (ilyass.arr ));
        // ilyass changed: this is called shallow copy.
        // for primitive this creates a new one, but for ref it is pointed to the original.

        System.out.println (Arrays.toString (twin.arr ));
        System.out.println (Arrays.toString (ilyass.arr) );
        // now its doesn't change because of deep copy.
    }
}
