package basics;

public class Add {


    // Method to add two numbers
    void addTwo(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two numbers = " + sum);
    }

    // Method to add three numbers
    void addThree(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three numbers = " + sum);
    }

    public static void main(String[] args) {
        Add obj = new Add();

        obj.addTwo(10, 20);      // calling method for two numbers
        obj.addThree(10, 20, 30); // calling method for three numbers
    }

    
}
