package basics;

import java.util.Scanner;

class modulosc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        result = a % b;
        System.out.println("Remainder=" + result);
        sc.close();

    }
}