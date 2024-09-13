package OPP3.Inheritance;

public class Boxcolor extends BoxWeight{
    String color;
    Boxcolor (){
        super();
        this.color = "non";
    }
    Boxcolor (double l , double w ,double h , double weight , String color){
        super(l,w,h,weight);
        this.color = color;
    }
}
