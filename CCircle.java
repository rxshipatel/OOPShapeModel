/**
 * class representing a circle which 
 * is extending COval
 * a Circle has is a special type of oval with the same horizontal and vertical radii.
 */
class CCircle extends COval {

    /**
     * constructor for Circle
     * @param radius the radius of the circle
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    @Override
    String getShapeType() {
        return "CIRCLE";
    }
}