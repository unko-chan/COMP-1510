package q1;

/**
 * The MultiCylinder class is the driver class for the Cylinder class.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class MultiCylinder {

    /**
     * The radius of the first cylinder.
     */
    private static final int CYLINDER_ONE_RADIUS = 2;

    /**
     * The height of the first cylinder.
     */
    private static final int CYLINDER_ONE_HEIGHT = 5;

    /**
     * The radius of the second cylinder.
     */
    private static final int CYLINDER_TWO_RADIUS = 3;

    /**
     * The height of the second cylinder.
     */
    private static final int CYLINDER_TWO_HEIGHT = 7;

    /**
     * The new radius of the first cylinder.
     */
    private static final int CYLINDER_ONE_NEW_RADIUS = 3;

    /**
     * The new height of the first cylinder.
     */
    private static final int CYLINDER_ONE_NEW_HEIGHT = 8;

    /**
     * The new radius of the second cylinder.
     */
    private static final int CYLINDER_TWO_NEW_RADIUS = 4;

    /**
     * The new height of the second cylinder.
     */
    private static final int CYLINDER_TWO_NEW_HEIGHT = 9;

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(CYLINDER_ONE_RADIUS,
                CYLINDER_ONE_HEIGHT);
        Cylinder cylinder2 = new Cylinder(CYLINDER_TWO_RADIUS,
                CYLINDER_TWO_HEIGHT);

        System.out.println("Cylinder 1 before modification:");
        System.out.println(cylinder1);
        System.out.println("Cylinder 1 volume: " + cylinder1.getVolume());
        System.out.println("Cylinder 1 surface area: "
                + cylinder1.getSurfaceArea());

        cylinder1.setRadius(CYLINDER_ONE_NEW_RADIUS);
        cylinder1.setHeight(CYLINDER_ONE_NEW_HEIGHT);

        System.out.println("Cylinder 1 after modification:");
        System.out.println(cylinder1);
        System.out.println("Cylinder 1 volume: " + cylinder1.getVolume());
        System.out.println("Cylinder 1 surface area: "
                + cylinder1.getSurfaceArea());

        System.out.println("\nCylinder 2 before modification:");
        System.out.println(cylinder2);
        System.out.println("Cylinder 2 volume: " + cylinder2.getVolume());
        System.out.println("Cylinder 2 surface area: "
                + cylinder2.getSurfaceArea());

        cylinder2.setRadius(CYLINDER_TWO_NEW_RADIUS);
        cylinder2.setHeight(CYLINDER_TWO_NEW_HEIGHT);

        System.out.println("Cylinder 2 after modification:");
        System.out.println(cylinder2);
        System.out.println("Cylinder 2 volume: " + cylinder2.getVolume());
        System.out.println("Cylinder 2 surface area: "
                + cylinder2.getSurfaceArea());
        System.out.println("Question one was called and ran sucessfully.");
    }

}
