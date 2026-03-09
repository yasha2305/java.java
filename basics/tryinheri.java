package basics; //not running

public class tryinheri {
    int a = 10;

    void show() {
        System.out.println("Value of a = " + a);
    }
}

class B extends tryinheri {
    void display() {
        System.out.println("This is a child class");
    }
}

class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
