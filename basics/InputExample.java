package basics;

import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: "); //taking user input and printing that number
        int num = sc.nextInt();

        System.out.println("Number is " + num);
    }
}