public class ScopeOfVariables {
    int i = 34;
    static int z;
    static {
        z=10;
        System.out.println("Inside static block is "+z);
    }
    void test() {
        int k=200;
        System.out.println("Local variable: " + (k+i));
    }
    public static void main(String[] args) {
        ScopeOfVariables obj = new ScopeOfVariables();
        obj.test();
        System.out.println(obj.i);
    }
}
