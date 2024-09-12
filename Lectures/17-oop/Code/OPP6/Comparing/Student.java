package OPP6.Comparing;

public class Student implements  Comparable<Student>{
    int roll;
    float marks;

    public Student (int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return marks + "";
    }


    @Override
    public int compareTo ( Student o ) {
        int diff =(int) (this.marks - o.marks);
        // if diff == 0: means both are equal
        // if diff < 1: means o is bigger else o is smaller
        return diff;
    }
}
