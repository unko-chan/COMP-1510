package ca.bcit.comp1510.lab05;

/**
 * The Sphere class.
 * @author Kevin Liang
 * @version 2023
 */

public class Sphere {
    /**
     * The x coordinate.
     */
    private double x;

    /**
     * The y coordinate.
     */
    private double y;

    /**
     * The z coordinate.
     */
    private double z;

    /**
     * The radius.
     */
    private double radius;


    /**
     * Constructs a sphere object.
     * @param sphereX the x coordinate.
     * @param sphereY the y coordinate.
     * @param sphereZ the z coordinate.
     * @param sphereRadius the radius.
     */
    public Sphere(double sphereX, double sphereY, double sphereZ,
                   double sphereRadius) {
        x = sphereX;
        y = sphereY;
        z = sphereZ;
        radius = sphereRadius;
    }


    /**
     * Gets the x coordinate.
     * @return the x coordinate.
     */
    public double getX() {
        return x;
    }


    /**
     * Gets the y coordinate.
     * @return the y coordinate.
     */
    public double getY() {
        return y;
    }


    /**
     * Gets the z coordinate.
     * @return the z coordinate.
     */
    public double getZ() {
        return z;
    }


    /**
     * Gets the radius.
     * @return the radius.
     */
    public double getRadius() {
        return radius;
    }


    /**
     * Sets the x coordinate.
     * @param sphereX the x coordinate.
     */
    public void setX(double sphereX) {
        x = sphereX;
    }


    /**
     * Sets the y coordinate.
     * @param sphereY the y coordinate.
     */
    public void setY(double sphereY) {
        y = sphereY;
    }


    /**
     * Sets the z coordinate.
     * @param sphereZ the z coordinate.
     */
    public void setZ(double sphereZ) {
        z = sphereZ;
    }


    /**
     * Sets the radius.
     * @param sphereRadius the radius.
     */
    public void setRadius(double sphereRadius) {
        radius = sphereRadius;
    }


    /**
     * Calculates the surface area.
     * @return the surface area.
     */
    public double surfaceArea() {
        final int four = 4;
        double area;

        area = four * Math.PI * Math.pow(radius, 2.0);

        return area;
    }


    /**
     * Calculates the volume.
     * @return the volume.
     */
    public double volume() {
        final double three = 3.0;
        final double four = 4.0;
        double volume;

        volume = four / three * Math.PI * Math.pow(radius, three);

        return volume;
    }


    /**
     * Returns a string representation of the object.
     * @return a string representation of the object.
     */
    public String toString() {
        double volume = volume();
        double area = surfaceArea();

        return "Surface area: " + area + "\n"
                + "Volume: " + volume;
    }
}

