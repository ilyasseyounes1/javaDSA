package OPP3.Polymorphism;

public class Circle extends Shapes{
    @Override // used as a simple check if there is an overriding or not
        // same obj in parent and child,but the body is diff
    // this will rum when the obj of Circle is created
    // hence, it is overriding the parent method
    void area (){
        System.out.println ("Area of circle");
    }
}
