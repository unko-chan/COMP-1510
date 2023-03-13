package q1;

/**
 * This class represents a cylinder.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Cylinder {

    /**
     * The radius of the cylinder.
     */
    private double radius;

    /**
     * The height of the cylinder.
     */
    private double height;


    /**
     * Constructs a new Cylinder object.
     *
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Gets the radius of the cylinder.
     * @return the radius of the cylinder
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the cylinder.
     * @param radius the radius of the cylinder
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the height of the cylinder.
     * @return the height of the cylinder
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the cylinder.
     * @param height the height of the cylinder
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the volume of the cylinder.
     * @return the volume of the cylinder
     */
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Gets the surface area of the cylinder.
     * @return the surface area of the cylinder
     */
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    /**
     * Returns a string representation of the cylinder.
     * @return a string representation of the cylinder
     */
    public String toString() {
        return "Radius: " + radius + "\nHeight: " + height;
    }

}
