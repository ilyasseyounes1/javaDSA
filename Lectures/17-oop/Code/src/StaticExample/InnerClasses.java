package OPP2.StaticExample;
// ilyasse younes 28/08/2024 
 
public class InnerClasses {
    static class Test { // only nested classes can be static 
        String name;
        public Test (String name) {
        this.name = name;
    }
    
    
    public static void main(String[] args) {
        Test a = new Test("ilyasse"); 
        Test b = new Test ("younes");
        System.out.println(a.name);
        System.out.println(b.name);
    }
        
    }
}

