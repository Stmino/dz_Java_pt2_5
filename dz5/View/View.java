package dz5.View;

import java.util.Scanner;

public class View {
    static Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public static char getMark() {

        System.out.println("Enter operator (+, -, *, /):");
        char operation = in.next().charAt(0);
        return operation;

    }
}
