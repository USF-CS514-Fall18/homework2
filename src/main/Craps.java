package main;

/** A class that allows a user to play a variation of
 * the game of Craps. Uses class Die. */
public class Craps {

    /**
     * Plays a variation of the game of Craps.
     * The rules are described in the comments of the play method.
     * @return true if user won, false otherwise
     */
    public boolean play() {
        boolean won = false;
        // FILL IN CODE
        // Create two dice objects
        // Implement the following logic of the game:

        // Phase 1: --------------
        // Roll two dice and check the sum of the face values.
        // If the sum is 2, 3 or 12, you lose - return false.
        // If the sum is 7 or 11, you win - return true .

        // If the sum is another value (4, 5, 6, 8, 9, or 10),
        // a "point" is established (equal to the sum of the two face values)
        // and you go to Phase 2 of the game.

        //2) Phase 2:
        // Continue to roll the dice until either a 7 or
        // the same "point" value (from Phase 1) is rolled.
        // If 7 is rolled, you loose (return false).
        // Otherwise you win (return true).


        return won;
    }

    /** main method, allows to test class Craps
     *
     * @param args command line arguments, ignored by this program
     */
    public static void main(String[] args) {
        Craps game = new Craps();
        boolean result = game.play();
        if (result)
            System.out.println("You won!");
        else
            System.out.println("You lost!");
    }
}
