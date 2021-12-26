import java.util.*;

public class SnakeLadder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {

        int dieRoll = 0;
        int playerPosition;

        for(playerPosition =0;playerPosition <=100; playerPosition++)
        {

            Random random = new Random();
            dieRoll = random.nextInt(6);
            System.out.println("Current die value " + dieRoll);

            Random randomOptions = new Random();
            int options = randomOptions.nextInt(3);

            switch (options) {
                case NO_PLAY: {
                    System.out.println("No Play: ");
                    System.out.println("Die  value: " + dieRoll);
                }
                case LADDER:
                {
                    System.out.println("Ladder: ");
                    System.out.println("Die  value: " + dieRoll);
                    if (playerPosition < 100) {
                        int currentPosition = playerPosition + dieRoll;
                        if (currentPosition <= 100) {
                            playerPosition = currentPosition;
                        } else {
                            System.out.println("Please keep trying to reach exact 100");
                        }
                    }
                }
                case SNAKE:
                {
                    System.out.println("Snake: ");
                    System.out.println("Die  value: " + dieRoll);
                    if (playerPosition > 0) {
                        int currentPosition = playerPosition - dieRoll;
                        if (currentPosition >= 0) {
                            playerPosition = currentPosition;
                        } else {
                            playerPosition = 0;
                            System.out.println("Please start again");
                        }
                    }
                }
            }
        }
    }
}
