package basics;
class A {
    int x, y, z;

    void Add() {
        z = x + y;

    }

    void show() {
        System.out.println("Addition =" + z);
    }

}

class addtwonum {
    public static void main(String arg[]) {
        A o1 = new A();

        o1.x = 1;
        o1.y = 2;
        o1.Add();
        o1.show();
    }
}
