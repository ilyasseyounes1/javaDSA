package OPP3.Inheritance;

public class Box {
    double l;
    double w;
    double h;
   //  double weight;
    static void Greeting (){
        System.out.println ("Im inside Box");
    }

    Box () {
        this.l = -1 ;
        this.w = -1;
        this.h = -1;
    }
    Box (double side ) {
        this.h = side ;
        this.w = side ;
        this.l = side ;

    }
    Box (double l , double w , double h){
        this.l = l;
        this.w = w;
        this.h = h;
    } 

    Box (Box old ) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
