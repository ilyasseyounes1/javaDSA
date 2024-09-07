package OPP3.Inheritance;

public class Main {
    public static void main(String[] args) {
      /*  Box box1 = new Box(1,4,5);
        System.out.println(box1.l);
        BoxWeight box2 = new BoxWeight ();
        System.out.println (box2.weight);*/
                    // SINGLE INHERITANCE : 1 ****************************************************************
        // BoxWeight box3 = new BoxWeight (1,2,3,4);
        // System.out.println (box3.l + "" + box3.w + "" + box3.h + "" + box3.weight);


       // Box box4 = new BoxWeight (1,2,4,5); // obj of type "box-weight" and the ref var of type "Box" .
        //System.out.println (box4.w);
        // System.out.println (box4.weight); ---> error

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        // BoxWeight box5 = new Box ();

                        // MULTILEVEL INHERITANCE :2 ********************************************************
       // BoxPrice box = new BoxPrice ();
       // BoxPrice box2 = new BoxPrice (5,3, 5); // use debug here to understand what s happen here .

                        // MULTI PAL INHERITANCE : 3 **********************************************************
                        // does not supported in java, for that we need interfaces

                        // HIERARCHICAL INHERITANCE : 4
        Boxcolor box9 = new Boxcolor ();
        Boxcolor box8 = new Boxcolor (2,3,4,5,"red");

        Box.Greeting (); // static method can inherit but cant be overriding
        Box box = new BoxWeight ();
        box.Greeting ();
        // Overriding depend on onj , static not depend on obj , hence u cant override static stuff
    }


}
