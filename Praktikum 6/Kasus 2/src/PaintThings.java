// *********************************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
// *********************************************************

import java.text.DecimalFormat;

public class PaintThings {
    // ------------------------------------------
    // Creates some shapes anf a paint object
    // and prints the amount of paint needed
    // to paint each shape.
    // ------------------------------------------
    public static void main(String[] args) throws Exception {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Shape[] shape = new Shape[3];

        // Instantiate deck to be a 20 by 35 foot rectangle
        shape[0] = new Rectangle(20, 35); // deck
        // Instantiate bigBall to be a sphere of radius 15
        shape[1] = new Sphere(15); // bigBall
        // Instantiate tank to be a cylinder of radius 10 and height 30
        shape[2] = new Cylinder(10, 30); // tank

        double deckAmt, ballAmt, tankAmt;
        // Make the appropriate method calls to assign the correct values to the three
        // amount variables.
        deckAmt = paint.amount(shape[0]);
        ballAmt = paint.amount(shape[1]);
        tankAmt = paint.amount(shape[2]);

        // Instantiate the three shapes to paint
        // Compute the amount of paint needed for each shape
        // Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
