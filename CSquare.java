/**
 * class representing a square
 * a square has length and with equal
 * it is a special type of rectangle
 */


class CSquare extends CRectangle {
    /**
     * constructor for CSquare
     * @param side length of the side of the square.
     */
    public CSquare(int side) {
        super(side, side);
    }

    @Override
    String getShapeType() {
        return "SQUARE";
    }
}
