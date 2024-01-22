/**
 * abstract class representing a shape
 * each shape has a unique id
 */
abstract class CShape {
    private static int counter = 0;
    private final int id;
    /**
     * constructor for CSHAPE.
     * it increments the counter and assigns it as the ID for the shape.
     */ 

    public CShape() {
        this.id = ++counter;

    }
    /**
     * getter for the shape ID
     * @return the ID of the shape
     */

    public int getId() {
        return id;
    }

    /**
     * abstract method to get the type of the shape
     * @return the dimensions of the shape
     */
    abstract String getShapeType();

    /**
     * abstract method to get the dimensions of the shape
     * @return the dimensions of the shape
     */
    abstract String getDimensions();
}