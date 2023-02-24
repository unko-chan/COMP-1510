package ca.bcit.comp1510.lab05;

/**
 * The cone class.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Cone {

    /**
     * The radius.
     */
    private double radius;

    /**
     * The height.
     */
    private double height;

    /**
     * Constructs a cone object.
     *
     * @param coneRadius the radius.
     * @param coneHeight the height.
     */
    public Cone(double coneRadius, double coneHeight) {
        radius = coneRadius;
        height = coneHeight;
    }

    /**
     * Gets the radius.
     * @return the radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Gets the height.
     * @return the height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the radius.
     * @param coneRadius the radius.
     */
    public void setRadius(double coneRadius) {
        radius = coneRadius;
    }

    /**
     * Sets the height.
     * @param coneHeight the height.
     */
    public void setHeight(double coneHeight) {
        height = coneHeight;
    }

    /**
     * Calculates the volume.
     * @return the volume.
     */
    public double volume() {
        final double three = 3.0;
        double volume;

        volume = Math.PI * Math.pow(radius, 2.0) * height / three;

        return volume;
    }

    /**
     * Calculates the slant height.
     * @return the slant height.
     */
    public double slantHeight() {
        double slantHeight;

        slantHeight = Math.sqrt(Math.pow(radius, 2.0) + Math.pow(height, 2.0));

        return slantHeight;
    }

    /**
     * Calculates the surface area.
     * @return the surface area.
     */
    public double surfaceArea() {
        double surfaceArea;

        surfaceArea = Math.PI * Math.pow(radius, 2.0)
                + Math.PI * radius * slantHeight();

        return surfaceArea;
    }

    /**
     * Returns a string representation of the object.
     * @return a string representation of the object.
     */
    public String toString() {
        return "Volume: " + volume() + " Surface Area: " + surfaceArea()
                + " Slant Height: " + slantHeight();
    }
}
