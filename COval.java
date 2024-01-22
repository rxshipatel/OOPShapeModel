/** 
 * class for an oval
 * an oval has horizonal and vertical radius
 */


class COval extends CShape {
    protected int horizontalRadius;
    protected int verticalRadius;

    /**
     * constructor for COval
     * @param horizontalRadius the horizontal radius of the oval
     * @param verticalRadius the vertical radius of th oval
     */

    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    @Override
    String getShapeType() {
        return "OVAL";
    }

    @Override
    String getDimensions() {
        return horizontalRadius + "x" + verticalRadius;
    }
}