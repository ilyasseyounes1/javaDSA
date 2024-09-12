package Enum;

enum Laptop {
    Mac(2000) , XPS(1800),Surface,Thinkpad(2100);// those are objects.
    // Here we creat the obj in the same class
    private int price ;
    private Laptop (int price){
        this.price = price;
    }

    Laptop () {
        price = 200;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }
}
public class EnumClass{
    public static void main ( String[] args ) {
        //Laptop lap = Laptop.Mac;
        //System.out.println (lap + " " + lap.getPrice ());

        for (Laptop lap: Laptop.values()) {
            System.out.println (lap + " : " + lap.getPrice ());
        }

    }
}
