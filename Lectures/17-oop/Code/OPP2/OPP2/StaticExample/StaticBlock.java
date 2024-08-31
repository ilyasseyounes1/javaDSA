package OPP2.StaticExample;

// ilyasse younes 28/08/2024 


// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;
    // will only run once , when the first obj is creat i.e when the class
    // loaded for the first time .1
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + "" + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + "" + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "" + StaticBlock.b);
        System.out.println(obj + "" + obj2);
    }

}