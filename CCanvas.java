import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * class representing a canvas
 * it contains a list of shapes.
 */
class CCanvas {
    /**
     * list of shapes contained in the canvas
     */
    private List<CShape> shapes = new ArrayList<>();


    /**
     * constructor for canvas.
     * generates 10 random shapes and adds them to canvas.
     */
    /**
     * the shapes are instanes of subclasses of CShape
     * the dimensions of shapes are randomly generated ints 
     * between 1-100
     * 
     * the shape type is also randomly determined.
     */

    public CCanvas() {
        Random rand = new Random();
        while (shapes.size() < 10) {
            int dimension1 = rand.nextInt(100) + 1;
            int dimension2 = rand.nextInt(100) + 1;
            CShape shape;
            switch (rand.nextInt(4)) {
                case 0:
                    shape = new COval(dimension1, dimension2);
                    break;
                case 1:
                    shape = new CCircle(dimension1);
                    break;
                case 2:
                    shape = new CRectangle(dimension1, dimension2);
                    break;
                default:
                    shape = new CSquare(dimension1);
                    break;
            }
            if (!shapes.contains(shape)) {
                shapes.add(shape);
            }
        }
    }

    /**
     * displays the contents of the canvas
     */

    public void displayContents() {
        System.out.println("canvas has the following random shapes:");
        for (CShape shape : shapes) {
            System.out.println("Shape " + shape.getId() + ": " + shape.getShapeType() + " " + shape.getDimensions());
        }
    }
}