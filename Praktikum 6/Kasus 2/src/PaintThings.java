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

        // Instantiate deck to be a 20 by 35 foot rectangle
        Rectangle deck = new Rectangle(20, 35);
        // Instantiate bigBall to be a sphere of radius 15
        Sphere bigBall = new Sphere(15);
        // Instantiate tank to be a cylinder of radius 10 and height 30
        Cylinder tank = new Cylinder(10, 30);

        double deckAmt, ballAmt, tankAmt;
        // Make the appropriate method calls to assign the correct values to the three
        // amount variables.
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

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
