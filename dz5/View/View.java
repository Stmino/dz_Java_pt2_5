package dz5.View;

import java.util.Scanner;

public class View {
    static Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(double data, String title) {
        System.out.printf("%s %s\n", title, data);
    }

    public static char getMark() {

        System.out.println("Enter operator (+, -, *, /):");
        char operation = in.next().charAt(0);
        return operation;

    }
}
