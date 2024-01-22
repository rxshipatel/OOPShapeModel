/**
 * class representing a rectangle
 * it has a length and width
 */

class CRectangle extends CShape {
    protected int length;
    protected int width;



/**
 * constructor for CRectangle
 * @param length of rectangle.
 * @param width of rectangle.
 */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    String getShapeType() {
        return "RECTANGLE";
    }

    @Override
    String getDimensions() {
        return length + "x" + width;
    }
}