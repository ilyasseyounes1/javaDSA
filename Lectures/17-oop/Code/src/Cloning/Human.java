package OPP6.Cloning;

public class Human implements Cloneable  {
    int age ;
    String name;
    int [] arr;

    public Human (int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {1,2,3,4,5,6,7,8,9};
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone (); // this is actually shallow copy,

        // make a deep copy:
        twin.arr = new int [twin.arr.length];
        for (int i = 0; i <twin.arr.length; i++){
            twin.arr[i] = arr[i];
        }
        return twin;
    }
}
