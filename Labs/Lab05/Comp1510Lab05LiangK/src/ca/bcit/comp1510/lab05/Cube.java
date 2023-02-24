package ca.bcit.comp1510.lab05;

/**
 * The cube class.
 * @author Kevin Liang
 * @version 2023
 */
public class Cube {

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
     * The edge length.
     */
    private double edgeLength;

    /**
     * Constructs a cube object.
     * @param cubeX the x coordinate.
     * @param cubeY the y coordinate.
     * @param cubeZ the z coordinate.
     * @param cubeEdgeLength the edge length.
     */
    public Cube(double cubeX, double cubeY, double cubeZ,
                double cubeEdgeLength) {
        x = cubeX;
        y = cubeY;
        z = cubeZ;
        edgeLength = cubeEdgeLength;
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
     * Gets the edge length.
     * @return the edge length.
     */
    public double getEdgeLength() {
        return edgeLength;
    }


    /**
     * Sets the x coordinate.
     * @param cubeX the x coordinate.
     */
    public void setX(double cubeX) {
        x = cubeX;
    }


    /**
     * Sets the y coordinate.
     * @param cubeY the y coordinate.
     */
    public void setY(double cubeY) {
        y = cubeY;
    }


    /**
     * Sets the z coordinate.
     * @param cubeZ the z coordinate.
     */
    public void setZ(double cubeZ) {
        z = cubeZ;
    }


    /**
     * Sets the edge length.
     * @param cubeEdgeLength the edge length.
     */
    public void setEdgeLength(double cubeEdgeLength) {
        edgeLength = cubeEdgeLength;
    }


    /**
     * Calculates the surface area.
     * @return the surface area.
     */
    public double surfaceArea() {
        final double six = 6.0;
        double area;

        area = six * Math.pow(edgeLength, 2.0);

        return area;
    }


    /**
     * Calculates the volume.
     * @return the volume.
     */
    public double volume() {
        final double three = 3.0;
        double volume;

        volume = Math.pow(edgeLength, three);

        return volume;
    }


    /**
     * Calculates the face diagonal.
     * @return the face diagonal.
     */
    public double faceDiagonal() {
        double diagonal;

        diagonal = Math.sqrt(2) * edgeLength;

        return diagonal;
    }


    /**
     * Calculates the space diagonal.
     * @return the space diagonal.
     */
    public double spaceDiagonal() {
        final int three = 3;
        double diagonal;

        diagonal = Math.sqrt(three) * edgeLength;

        return diagonal;
    }


    /**
     * Returns a string representation of the cube.
     * @return a string representation of the cube.
     */
    public String toString() {
        return "Surface area: " + surfaceArea() + '\n'
                + "Volume: " + volume() + '\n'
                + "Face diagonal: " + faceDiagonal() + '\n'
                + "Space diagonal: " + spaceDiagonal();
    }
}
