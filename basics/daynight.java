package basics;

import java.util.Scanner;

public class daynight {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter true if sun is up, otherwise enter false:");

        boolean isSunUp = sc.nextBoolean();

        if (isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");

        sc.close();
    }
}