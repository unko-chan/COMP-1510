package ca.bcit.comp1510.lab05;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * The GeometryDriver class.
 * @author Kevin Liang
 * @version 2023
 */
public class GeometryDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int digits = 3;

        System.out.println("Enter the radius and coordinates for a sphere.");
        double sphereRadius = scan.nextDouble();
        double sphereX = scan.nextDouble();
        double sphereY = scan.nextDouble();
        double sphereZ = scan.nextDouble();

        Sphere sphere = new Sphere(sphereX, sphereY, sphereZ, sphereRadius);

        System.out.println("Enter the edge length and coordinates for a cube.");
        double cubeEdge = scan.nextDouble();
        double cubeX = scan.nextDouble();
        double cubeY = scan.nextDouble();
        double cubeZ = scan.nextDouble();

        Cube cube = new Cube(cubeX, cubeY, cubeZ, cubeEdge);

        System.out.println("Enter the radius and height for "
                + "a right circular cone");
        double coneRadius = scan.nextDouble();
        double coneHeight = scan.nextDouble();

        Cone cone = new Cone(coneRadius, coneHeight);

        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(digits);

        System.out.println("Sphere volume: " + format.format(sphere.volume())
                + " Sphere surface area: "
                + format.format(sphere.surfaceArea()));

        System.out.println("Cube volume: " + format.format(cube.volume())
                + " Cube surface area: " + format.format(cube.surfaceArea())
                + " Cube diagonal: " + format.format(cube.spaceDiagonal()
                + " Cube edge length: " + format.format(cube.faceDiagonal()))
        );

        System.out.println("Cone volume: " + format.format(cone.volume())
                + " Cone surface area: " + format.format(cone.surfaceArea())
                + " Cone slant height: " + format.format(cone.slantHeight())
        );

        scan.close();
    }
}
