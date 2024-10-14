package OPP5.Enums;

public class Basic{
    enum Week implements A{
        Monday,Tuesday , Wednesday , Thursday , Friday , Saturday,Sunday;
        /**
         * these are enum constants.
         * public,static and final.
         * since its final u can create child enums
         * type is Week
         */
        Week (){
            System.out.println ("Constructor called for " + this);
            /*
            this is not public or protected ,only private or default
            why? we don't want to  creat new obj ,
             and if its public or protected its allow u ot creat new obj.
            this is not the enum concept , that's why.
            */
        }
        // Abstract are not allowed in enum.

        @Override
        public void a () {
            System.out.println ("u can implement any interface u want ");
        }
    }

    public static void main ( String[] args ) {
        Week week;
        week = Week.Monday;
      /*  for (Week day : Week.values()) {
            System.out.println (day);
        }*/
        System.out.println (week.ordinal());
        System.out.println (week.valueOf ( "Monday" ));
    }
}
