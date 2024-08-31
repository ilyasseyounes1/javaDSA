package OPP2.StaticExample;
// ilyasse younes 28/08/2024 

public class Main {

    public static void main(String[] args) {
        // Human ilyass = new Human(21, "ilyasse", 23990, false);
        // Human younes = new Human(21, "younes", 28000, false);
        // Human salma = new Human(21, "salma", 25000, false);
        System.out.println(Human.population);

        Main fun3 = new Main();
        fun3.fun2();

    }

    static void fun() {
        // greeting(); you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.Greeting();

    }

    void fun2() {
        // we know that something which is not static, belongs to an object

        Greeting();
    }

    void Greeting() {
        // fun(); its will work
        System.out.println("hello world");
    }

}
