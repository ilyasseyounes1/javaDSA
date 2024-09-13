package OPP3.Inheritance;
public  class BoxWeight extends Box {
    double weight ;
    public BoxWeight() {
        this.weight = -1;

    }
    static void Greeting (){
        System.out.println ("im inside Boxwight");
    }
    public  BoxWeight(double l , double w, double h ,double weight) {
        super (l,w,h) ; // used to initialise values present in parent class .
        // there are tow use case of super this is first one  (1)
        this.weight = weight;
                                             //this is the second (2):
       // System.out.println (this.weight);   // ---> here if we declare weight in the child class.
       // System.out.println (super.weight); ---> here we use super if we declare weight in the parent class .

    }
    public BoxWeight ( BoxWeight other) {
        super(other);
        weight = other.weight;
    }
    BoxWeight (double side , double weight){
        super (side );
        this.weight = weight;
    }


}
