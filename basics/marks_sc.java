package basics;

import java.util.Scanner;

public class marks_sc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        System.out.println("Enter Physics marks:");
        marks[0] = sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        marks[1] = sc.nextInt();
        System.out.println("Enter Maths marks:");
        marks[2] = sc.nextInt();
        System.out.println("Marks are:");
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
    }

}
