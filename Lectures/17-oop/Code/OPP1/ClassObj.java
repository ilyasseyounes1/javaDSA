package OPP1;
import java.util.Arrays;

public class ClassObj {

    public static void main(String[] args) {
        // data of 5 Students :

        // int[] id = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];
        class Students {

            int roll;
            String name;
            float marks;

            Students() { // constractor ?

                this.roll = 10;
                this.name = "ilyasse";
                this.marks = 88.3f;
                // this is how you call a constructor from another constructor
                // internally: new Student (13, "default person", 100.0f);
                // this (13, "default person", 100.0f);
            }

            /*************************************************************/
            Students(int ron, String name, float marks) {
                this.roll = ron;
                this.name = name;
                this.marks = marks;
            } // there is tow Student constractor this is const.. overloading ...

            /*************************************************************/
            Students(Students other) {
                this.name = other.name;
                this.roll = other.roll;
                this.marks = other.marks;
            }

            /*************************************************************/
            void changeName(String Newname) {
                this.name = Newname;
            }

            /**************************************************************/
            void greeting() {
                System.out.println("Hellw! My name is " + this.name);
            }

        }
        Students S1 = new Students();
        Students S2 = new Students(20, "Younes", 99f);
        Students S3 = new Students(S2);
        /*
         * S2.roll = 33;
         * S2.name = "ilyasee ";
         * S2.marks = 99.2f;
         */
        S3.changeName("salma");

        System.out.println(S1.roll);
        System.out.println(S1.name);
        System.out.println(S1.marks);

        System.out.println(S2.roll);
        System.out.println(S2.name);
        System.out.println(S2.marks);

        System.out.println(S3.roll);
        System.out.println(S3.name);
        System.out.println(S3.marks);

        S1.greeting();
        S2.greeting();

    }
}