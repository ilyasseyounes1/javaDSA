package OPP3.Polymorphism;
//every class extends obj class
public class ObjectPrint{
    int num;
    ObjectPrint (int num ){
        this.num = num;
    }
    @Override
    public String toString (){  // overriding the default toString method "use clr and click println --->?"
        return "ObjectPrint{" + "num=" + num + '}'; // at runtime decides it, this method.
    }

    public static void main ( String[] args ) {
        ObjectPrint obj = new ObjectPrint ( 33 );
        System.out.println (obj);
    }
}
