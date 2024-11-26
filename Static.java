class Main {
    static int a = 6;
    static int b;
    static void math(int x) {
        System.out.println("X = "+x);
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
    static {
        System.out.println("Static block Initialised");
        b = a*4;
    }
    public static void main (String[] args) {
        System.out.println("Hello world!!");
        math(42);
    }
}
