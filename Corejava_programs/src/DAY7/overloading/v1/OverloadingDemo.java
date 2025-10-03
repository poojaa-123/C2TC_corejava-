package DAY7.overloading.v1;

public class OverloadingDemo {
    static class Point {
        float x, y;
        Point() { x = 0; y = 0; }
        Point(float a) { x = a; y = 0; }
        Point(float a, float b) { x = a; y = b; }
        @Override public String toString() { return "(" + x + ", " + y + ")"; }
    }

    static class MethodOverLoading {
        public static int addition(int a, int b) { return a + b; }
        public static float addition(float a, float b) { return a + b; }
        public static float addition(int a, float b) { return a + b; }
        public static float addition(float a, int b) { return a + b; }
        public static String addition(String a, String b) { return a + b; }
    }

    public static void main(String[] args) {
        System.out.println(new Point());
        System.out.println(new Point(14.5f));
        System.out.println(new Point(12.5f, 20.5f));
        System.out.println(MethodOverLoading.addition("Hello ", "World"));
    }
}