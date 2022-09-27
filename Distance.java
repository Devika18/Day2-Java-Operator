//Java program to calculate distance between two points

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter x and y: ");

        // taking input from command-line
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);

        int x = obj1.nextInt();
        int y = obj2.nextInt();

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
